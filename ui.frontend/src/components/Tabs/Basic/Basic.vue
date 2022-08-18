<template>
  <form @submit.prevent="">
    <div id="divisionInputsSup">
      <DefaultField FieldClass="fullname"
                    InputType="text"
                    Storage="fullname"
                    :InputValue="setInputValue('fullname')"
                    :InputPlaceholder="FullNamePlaceholder"
                    :InvalidText="FullNameInvalidText"
                    :FontColor="FontColor"
                    :FontSize="FontSize"
                    :FontType="FontType"
                    :LabelContent="FullNameLabel"
                    FieldSize="100%"
                     />
      <DefaultField FieldClass="nickname"
                    InputType="text"
                    Storage="nickname"
                    :InputValue="setInputValue('nickname')"
                    :InputPlaceholder="NicknamePlaceholder"
                    :InvalidText="NicknameInvalidText"
                    :FontColor="FontColor"
                    :FontSize="FontSize"
                    :FontType="FontType"
                    :LabelContent="NicknameLabel"
                    FieldSize="100%"
                    />
    </div>
    <div id="divisionPhoneEmail">
      <DefaultField FieldClass="email"
                    InputType="email"
                    Storage="email"
                    :InputValue="setInputValue('email')"
                    :InputPlaceholder="EmailPlaceholder"
                    :InvalidText="EmailInvalidText"
                    :FontColor="FontColor"
                    :FontSize="FontSize"
                    :FontType="FontType"
                    :LabelContent="EmailLabel"
                    />
      <DefaultField FieldClass="phone"
                    InputType="tel"
                    Storage="phone"
                    :InputValue="setInputValue('phone')"
                    :InputPlaceholder="PhonePlaceholder"
                    :InvalidText="PhoneInvalidText"
                    :FontColor="FontColor"
                    :FontSize="FontSize"
                    :FontType="FontType"
                    :LabelContent="PhoneLabel"
                    />
    </div>
    <Birthday />
    <fieldset class="form-footer">
      <Checkbox />
      <ButtonComponent type="0" Btext="Next" :clickButton="validate" />
    </fieldset>
  </form>
</template>

<script>
import DefaultField from '@/components/FormFields/DefaultField/DefaultField.vue'
import Checkbox from '@/components/FormFields/Checkbox/Checkbox.vue'
import Birthday from '@/components/FormFields/Birthday/Birthday.vue'
import { mapActions } from 'vuex'
import ButtonComponent from '@/components/Micro/Button/Button.vue'
import Patterns from '@/Validations.js'
export default {
  name: 'Basic',
  components: {
    Checkbox,
    DefaultField,
    Birthday,
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
    InputStyle: String,
    FullNamePlaceholder: {
      type: String
    },
    FullNameInvalidText: {
      type: String
    },
    FullNameLabel: {
      type: String
    },
    NicknamePlaceholder: {
      type: String
    },
    NicknameInvalidText: {
      type: String
    },
    NicknameLabel: {
      type: String
    },
    EmailPlaceholder: {
      type: String
    },
    EmailInvalidText: {
      type: String
    },
    EmailLabel: {
      type: String
    },
    PhonePlaceholder: {
      type: String
    },
    PhoneInvalidText: {
      type: String
    },
    PhoneLabel: {
      type: String
    }
  },
  methods: {
    ...mapActions(['nextTab']),
    setInputValue (field) {
      return localStorage.getItem(field) ? localStorage.getItem(field) : ''
    },
    validate () {
      const invalids = ['fullname', 'nickname', 'email', 'phone'].filter((field) => {
        const value = document.querySelector(`.${field} > input`).value
        const error = document.querySelector(`.${field} > span`)
        if (!Patterns[field].test(value)) {
          if (field === 'nickname' || field === 'phone') {
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

      // const errors = ['fullname', 'nickname', 'email', 'phone'].forEach((field) => {
      //   const value = document.querySelector(`.${field} > input`).value
      //   const error = document.querySelector(`.${field} > span`)
      //   if (!Patterns[field].test(value)) {
      //     error.style.visibility = 'visible'
      //   } else {
      //     error.style.visibility = 'hidden'
      //   }
      // })
    }
  }
}
</script>

<style lang="scss" scoped>
@import './Basic.scss';
</style>
