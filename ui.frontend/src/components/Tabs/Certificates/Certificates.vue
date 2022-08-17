<template>
  <form>
    <DefaultField FieldClass="certificates"
                  InputType="text"
                  :InputPlaceholder="CertificatesPlaceholder"
                  :LabelFontColor="CertificatesLabelColor"
                  :LabelFontSize="CertificatesFontSize"
                  :LabelContent="CertificatesLabel"
                  :FontType="CertificatesFontType"
                  FieldSize="100%"
                   />
    <DefaultField FieldClass="teamname"
                  InputType="text"
                  :InputPlaceholder="TeamNamePlaceholder"
                  :InvalidText="TeamNameInvalidText"
                  :LabelFontColor="TeamNameLabelColor"
                  :LabelFontSize="TeamNameFontSize"
                  :LabelContent="TeamNameLabel"
                  :FontType="TeamNameFontType"
                  FieldSize="100%"
                   />
    <DefaultField FieldClass="institution"
                  InputType="text"
                  :InputPlaceholder="InstitutionPlaceholder"
                  :InvalidText="InstitutionInvalidText"
                  :LabelFontColor="InstitutionLabelColor"
                  :LabelFontSize="InstitutionFontSize"
                  :LabelContent="InstitutionLabel"
                  :FontType="InstitutionFontType"
                  FieldSize="100%"
                   />
    <DefaultField FieldClass="graduation"
                  InputType="text"
                  :InputPlaceholder="GraduationPlaceholder"
                  :InvalidText="GraduationInvalidText"
                  :LabelFontColor="GraduationLabelColor"
                  :LabelFontSize="GraduationFontSize"
                  :LabelContent="GraduationLabel"
                  :FontType="GraduationFontType"
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
    CertificatesFontType: {
      type: String
    },
    CertificatesFontSize: {
      type: Number
    },
    CertificatesLabelColor: {
      type: String
    },
    CertificatesPlaceholder: {
      type: String
    },
    CertificatesLabel: {
      type: String
    },
    GraduationFontType: {
      type: String
    },
    GraduationFontSize: {
      type: Number
    },
    GraduationLabelColor: {
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
    TeamNameFontType: {
      type: String
    },
    TeamNameFontSize: {
      type: Number
    },
    TeamNameLabelColor: {
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
    InstitutionFontType: {
      type: String
    },
    InstitutionFontSize: {
      type: Number
    },
    InstitutionLabelColor: {
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
    ...mapActions(['nextTab'])
  }
}
</script>

<style lang="scss" scoped>
</style>
