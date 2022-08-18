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
                    />
    </div>
    <ButtonComponent type="1" Btext="Next" :clickButton="validate" />
  </form>
</template>

<script>
import DefaultField from '@/components/FormFields/DefaultField/DefaultField.vue'
import { mapActions } from 'vuex'
import ButtonComponent from '@/components/Micro/Button/Button.vue'
import Patterns from '@/Validations.js'
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
    },
    validate () {
      const invalids = ['github', 'linkedin'].filter((field) => {
        const value = document.querySelector(`.${field} > input`).value
        const error = document.querySelector(`.${field} > span`)
        if (!Patterns[field].test(value)) {
          if (field === 'linkedin') {
            if (value !== '') {
              return field
            } else {
              error.style.visibility = 'hidden'
            }
          } else {
            return field
          }
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
@import './Social.scss';
</style>
