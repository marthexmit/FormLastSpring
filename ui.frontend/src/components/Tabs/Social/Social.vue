<template>
  <form>
    <div class="divisionInputsSocial">
      <DefaultField FieldClass="linkedin"
                    InputType="text"
                    Storage="linkedin"
                    :InputValue="setInputValue('linkedin')"
                    :InputPlaceholder="LinkedinPlaceholder"
                    :InvalidText="LinkedinInvalidText"
                    :FontColor="FontColor"
                    :FontSize="FontSize"
                    :FontType="FontType"
                    :LabelContent="LinkedinLabel"
                    FieldSize="100%"
                    />
      <DefaultField FieldClass="github"
                    InputType="text"
                    Storage="github"
                    :InputValue="setInputValue('github')"
                    :InputPlaceholder="GithubPlaceholder"
                    :InvalidText="GithubInvalidText"
                    :FontColor="FontColor"
                    :FontSize="FontSize"
                    :FontType="FontType"
                    :LabelContent="GithubLabel"
                    FieldSize="100%"
                    />
    </div>
    <ButtonComponent type="1" Btext="Next" :clickButton="nextTab" />
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
    FontType: {
      type: String
    },
    FontSize: {
      type: Number
    },
    FontColor: {
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
    ...mapActions(['nextTab']),
    setInputValue (field) {
      return localStorage.getItem(field) ? localStorage.getItem(field) : ''
    }
  }
}
</script>

<style lang="scss" scoped>
@import './Social.scss'
</style>
