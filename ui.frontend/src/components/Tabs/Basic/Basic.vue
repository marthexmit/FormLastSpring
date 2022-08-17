<template>
  <form @submit.prevent="">
    <div id="divisionInputsSup">
      <DefaultField FieldClass="fullname"
                    InputType="text"
                    Storage="fullname"
                    :InputValue="setInputValue('fullname')"
                    :InputPlaceholder="FullNamePlaceholder"
                    :InvalidText="FullNameInvalidText"
                    :LabelFontColor="FullNameLabelColor"
                    :LabelFontSize="FullNameFontSize"
                    :LabelContent="FullNameLabel"
                    :FontType="FullNameFontType"
                    FieldSize="100%"
                     />
      <DefaultField FieldClass="nickname"
                    InputType="text"
                    Storage="nickname"
                    :InputValue="setInputValue('nickname')"
                    :InputPlaceholder="NicknamePlaceholder"
                    :InvalidText="NicknameInvalidText"
                    :LabelFontColor="NicknameLabelColor"
                    :LabelFontSize="NicknameFontSize"
                    :LabelContent="NicknameLabel"
                    :FontType="NicknameFontType"
                    FieldSize="100%"
                    />
    </div>
    <div id="divisionPhoneBirthday">
      <DefaultField FieldClass="email"
                    InputType="email"
                    Storage="email"
                    :InputValue="setInputValue('email')"
                    :InputPlaceholder="EmailPlaceholder"
                    :InvalidText="EmailInvalidText"
                    :LabelFontColor="EmailLabelColor"
                    :LabelFontSize="EmailFontSize"
                    :LabelContent="EmailLabel"
                    :FontType="EmailFontType"
                    FieldSize="60%"
                    />
      <DefaultField FieldClass="phone"
                    InputType="tel"
                    Storage="phone"
                    :InputValue="setInputValue('phone')"
                    :InputPlaceholder="PhonePlaceholder"
                    :InvalidText="PhoneInvalidText"
                    :LabelFontColor="PhoneLabelColor"
                    :LabelFontSize="PhoneFontSize"
                    :LabelContent="PhoneLabel"
                    :FontType="PhoneFontType"
                    FieldSize="33%"
                    />
    </div>
    <Birthday />
    <fieldset class="form-footer">
      <Checkbox />
      <ButtonComponent type="0" Btext="Next" :clickButton="nextTab" />
    </fieldset>
  </form>
</template>

<script>
import DefaultField from '@/components/FormFields/DefaultField/DefaultField.vue'
import Checkbox from '@/components/FormFields/Checkbox/Checkbox.vue'
import Birthday from '@/components/FormFields/Birthday/Birthday.vue'
import { mapActions } from 'vuex'
import ButtonComponent from '@/components/Micro/Button/Button.vue'
export default {
  name: 'Basic',
  components: {
    Checkbox,
    DefaultField,
    Birthday,
    ButtonComponent
  },
  props: {
    FullNameFontType: {
      type: String
    },
    FullNameFontSize: {
      type: Number
    },
    FullNameLabelColor: {
      type: String
    },
    FullNamePlaceholder: {
      type: String
    },
    FullNameInvalidText: {
      type: String
    },
    FullNameLabel: {
      type: String
    },
    NicknameFontType: {
      type: String
    },
    NicknameFontSize: {
      type: Number
    },
    NicknameLabelColor: {
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
    EmailFontType: {
      type: String
    },
    EmailFontSize: {
      type: Number
    },
    EmailLabelColor: {
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
    PhoneFontType: {
      type: String
    },
    PhoneFontSize: {
      type: Number
    },
    PhoneLabelColor: {
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
    },
    PhoneSize: {
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
@import './Basic.scss';
</style>
