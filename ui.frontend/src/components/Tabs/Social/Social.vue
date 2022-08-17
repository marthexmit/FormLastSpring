<template>
  <form>
    <DefaultField FieldClass="linkedin"
                  InputType="text"
                  :InputPlaceholder="LinkedinPlaceholder"
                  :InvalidText="LinkedinInvalidText"
                  :LabelFontColor="LinkedinLabelColor"
                  :LabelFontSize="LinkedinFontSize"
                  :LabelContent="LinkedinLabel"
                  :FontType="LinkedinFontType"
                  FieldSize="100%"
                   />
    <DefaultField FieldClass="github"
                  InputType="text"
                  :InputPlaceholder="GithubPlaceholder"
                  :InvalidText="GithubInvalidText"
                  :LabelFontColor="GithubLabelColor"
                  :LabelFontSize="GithubFontSize"
                  :LabelContent="GithubLabel"
                  :FontType="GithubFontType"
                  FieldSize="100%"
                   />

    <ButtonComponent Btext="Next" :clickButton="nextTab" />
  </form>
</template>

<script>
import DefaultField from '@/components/FormFields/DefaultField/DefaultField.vue'
import { mapActions } from 'vuex'
import ButtonComponent from '@/components/Micro/Button/Button.vue'
export default {
  name: 'Social',
  components: {
    DefaultField,
    ButtonComponent
  },
  props: {
    LinkedinFontType: {
      type: String
    },
    LinkedinFontSize: {
      type: Number
    },
    LinkedinLabelColor: {
      type: String
    },
    LinkedinPlaceholder: {
      type: String
    },
    LinkedinInvalidText: {
      type: String
    },
    LinkedinLabel: {
      type: String
    },
    GithubFontType: {
      type: String
    },
    GithubFontSize: {
      type: Number
    },
    GithubLabelColor: {
      type: String
    },
    GithubPlaceholder: {
      type: String
    },
    GithubInvalidText: {
      type: String
    },
    GithubLabel: {
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
