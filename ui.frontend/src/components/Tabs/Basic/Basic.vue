<template>
  <form>
    <DefaultField FieldClass="fullname"
                  InputType="text"
                  :InputPlaceholder="FullNamePlaceholder"
                  :InvalidText="FullNameInvalid"
                  :LabelFontColor="FullNameLabelColor"
                  :LabelFontSize="FullNameFontSize"
                  :LabelContent="FullNameLabel"
                  :FontType="FullNameFontType"
                  FieldSize="100%"
                   />
    <DefaultField FieldClass="nickname"
                  InputType="text"
                  :InputPlaceholder="NicknamePlaceholder"
                  :InvalidText="NicknameInvalid"
                  :LabelFontColor="NicknameLabelColor"
                  :LabelFontSize="NicknameFontSize"
                  :LabelContent="NicknameLabel"
                  :FontType="NicknameFontType"
                  FieldSize="100%"
                  />
    <DefaultField FieldClass="email"
                  InputType="email"
                  :InputPlaceholder="EmailPlaceholder"
                  :InvalidText="EmailInvalid"
                  :LabelFontColor="EmailLabelColor"
                  :LabelFontSize="EmailFontSize"
                  :LabelContent="EmailLabel"
                  :FontType="EmailFontType"
                  FieldSize="60%"
                  />
    <DefaultField FieldClass="phone"
                  InputType="tel"
                  :InputPlaceholder="PhonePlaceholder"
                  :InvalidText="PhoneInvalid"
                  :LabelFontColor="PhoneLabelColor"
                  :LabelFontSize="PhoneFontSize"
                  :LabelContent="PhoneLabel"
                  :FontType="PhoneFontType"
                  FieldSize="40%"/>
    <Birthday />
    <Checkbox />
    <Button />
  </form>
</template>

<script>
import DefaultField from '@/components/FormFields/DefaultField/DefaultField.vue'
import Checkbox from '@/components/FormFields/Checkbox/Checkbox.vue'
import Birthday from '@/components/FormFields/Birthday/Birthday.vue'
import Button from '@/components/Micro/Button/Button.vue'
export default {
  name: 'Basic',
  components: {
    Checkbox,
    DefaultField,
    Birthday,
    Button
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
    NicknameSize: {
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
    EmailSize: {
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
  }
}
</script>

<style scoped>
form {
  display: flex;
  flex-wrap: wrap;
}
</style>
