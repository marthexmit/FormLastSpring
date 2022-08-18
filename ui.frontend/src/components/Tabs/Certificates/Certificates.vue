<template>
  <form>
    <div class="DivisionCertificate">
    <DefaultField FieldClass="certificates"
                  InputType="text"
                  Storage="certificate"
                  :InputValue="setInputValue('certificate')"
                  :InputPlaceholder="CertificatesPlaceholder"
                  :FontColor="FontColor"
                  :FontSize="FontSize"
                  :FontType="FontType"
                  :LabelContent="CertificatesLabel"
                  FieldSize="100%"
                   />
    </div>
    <div class="divisionButtonsCertificate">
      <div class="certificates">
        <ButtonComponent id="view-certificates-btn" type='4' Btext="Certificates" :clickButton="viewCertificates" />
        <ul class="certificates-list">
          <li v-for="(certificate, i) in getCertificatesList" :key="i" class="certificates-item">
            <span>{{ certificate }}</span>
            <button @click.prevent="removeCertificate(i)">X</button>
          </li>
        </ul>
      </div>
      <ButtonComponent type='3' Btext="More" :clickButton="addCertificate" />
    </div>
    <div class="DivisionAfterCertificate">
      <DefaultField FieldClass="teamname"
                    InputType="text"
                    Storage="teamname"
                    :InputValue="setInputValue('teamname')"
                    :InputPlaceholder="TeamNamePlaceholder"
                    :InvalidText="TeamNameInvalidText"
                    :FontColor="FontColor"
                    :FontSize="FontSize"
                    :FontType="FontType"
                    :LabelContent="TeamNameLabel"
                    FieldSize="100%"
                    />
      <DefaultField FieldClass="institution"
                    InputType="text"
                    Storage="institution"
                    :InputValue="setInputValue('institution')"
                    :InputPlaceholder="InstitutionPlaceholder"
                    :InvalidText="InstitutionInvalidText"
                    :FontColor="FontColor"
                    :FontSize="FontSize"
                    :FontType="FontType"
                    :LabelContent="InstitutionLabel"
                    FieldSize="100%"
                    />
      <DefaultField FieldClass="graduation"
                    InputType="text"
                    Storage="graduation"
                    :InputValue="setInputValue('graduation')"
                    :InputPlaceholder="GraduationPlaceholder"
                    :InvalidText="GraduationInvalidText"
                    :FontColor="FontColor"
                    :FontSize="FontSize"
                    :FontType="FontType"
                    :LabelContent="GraduationLabel"
                    FieldSize="100%"
                    />
      </div>
    <ButtonComponent type='2' Btext="Finish" :clickButton="validate" />
  </form>
</template>

<script>
import DefaultField from '@/components/FormFields/DefaultField/DefaultField.vue'
import ButtonComponent from '@/components/Micro/Button/Button.vue'
import { mapActions } from 'vuex'
import Patterns from '@/Validations.js'
export default {
  name: 'Certificates',
  components: {
    DefaultField,
    ButtonComponent
  },
  props: {
    FontType: {
      type: String
    },
    FontSize: {
      type: Number
    },
    FontColor: {
      type: String
    },
    CertificatesPlaceholder: {
      type: String
    },
    CertificatesLabel: {
      type: String
    },
    GraduationPlaceholder: {
      type: String
    },
    GraduationInvalidText: {
      type: String
    },
    GraduationLabel: {
      type: String
    },
    TeamNamePlaceholder: {
      type: String
    },
    TeamNameInvalidText: {
      type: String
    },
    TeamNameLabel: {
      type: String
    },
    InstitutionPlaceholder: {
      type: String
    },
    InstitutionInvalidText: {
      type: String
    },
    InstitutionLabel: {
      type: String
    }
  },
  data () {
    return {
      certificate: '',
      certificates: []
    }
  },
  computed: {
    getCertificatesList () {
      // return localStorage.getItem('certificates').split(',')
      return this.certificates
    }
  },
  methods: {
    ...mapActions(['nextTab']),
    setInputValue (field) {
      return localStorage.getItem(field) ? localStorage.getItem(field) : ''
    },
    addCertificate () {
      this.certificates.push(localStorage.getItem('certificate'))
      localStorage.setItem('certificates', JSON.stringify(this.certificates))
      localStorage.setItem('certificate', '')
    },
    removeCertificate (i) {
      this.certificates = this.certificates.filter((data, index) => index !== i)
      localStorage.setItem('certificates', JSON.stringify(this.certificates))
    },
    validate () {
      const invalids = ['teamname', 'institution', 'graduation'].filter((field) => {
        const value = document.querySelector(`.${field} > input`).value
        const error = document.querySelector(`.${field} > span`)
        if (!Patterns[field].test(value)) {
          return field
        } else {
          error.style.visibility = 'hidden'
        }
      })

      if (invalids.length) {
        invalids.filter((field) => {
          const error = document.querySelector(`.${field} > span`)
          error.style.visibility = 'visible'
        })
      } else {
        this.nextTab()
      }
    }
  }
}
</script>

<style lang="scss" scoped>
@import './Certificate.scss';
</style>
