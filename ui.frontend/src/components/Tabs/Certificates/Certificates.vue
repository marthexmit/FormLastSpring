<template>
  <form>
    <DefaultField FieldClass="certificates"
                  InputType="text"
                  Storage="certificates"
                  :InputValue="setInputValue('certificates')"
                  :InputPlaceholder="CertificatesPlaceholder"
                  :FontColor="FontColor"
                  :FontSize="FontSize"
                  :FontType="FontType"
                  :LabelContent="CertificatesLabel"
                  FieldSize="100%"
                   />
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
                  Storage="teamname"
                  :InputValue="setInputValue('teamname')"
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
                  Storage="teamname"
                  :InputValue="setInputValue('teamname')"
                  :InputPlaceholder="GraduationPlaceholder"
                  :InvalidText="GraduationInvalidText"
                  :FontColor="FontColor"
                  :FontSize="FontSize"
                  :FontType="FontType"
                  :LabelContent="GraduationLabel"
                  FieldSize="100%"
                   />
    <ButtonComponent Btext="Next" :clickButton="nextTab" />
  </form>
</template>

<script>
import DefaultField from '@/components/FormFields/DefaultField/DefaultField.vue'
import ButtonComponent from '@/components/Micro/Button/Button.vue'
import { mapActions } from 'vuex'
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
  methods: {
    ...mapActions(['nextTab']),
    setInputValue (field) {
      return localStorage.getItem(field) ? localStorage.getItem(field) : ''
    }
  }
}
</script>

<style lang="scss" scoped>
</style>
