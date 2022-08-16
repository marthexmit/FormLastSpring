<template>
  <div :style="{ width: FieldSize }" :class="FieldClass">
    <Label :ForInput="InputId" :style="{ fontSize: LabelFontSize + 'px', color: LabelFontColor, fontFamily: FontType }">{{ LabelContent }}</Label>
    <TextComponent :newtext="InvalidText" :style="{ fontFamily: FontType }"/>
    <Input
      :InputType="InputType"
      :InputPlaceholder="InputPlaceholder"
      :InputId="InputId"
      @input="getValue"
      :InputValue="InputValue"
      :style="{ fontFamily: FontType }"
    />
  </div>
</template>

<script>
import Label from '@/components/Micro/Label/Label.vue'
import Input from '@/components/Micro/Input/Input.vue'
import TextComponent from '@/components/Micro/TextComponent/TextComponent.vue'
export default {
  name: 'DefaultField',
  components: {
    Label,
    Input,
    TextComponent
  },
  props: {
    FieldClass: {
      type: String
    },
    FieldSize: {
      type: String,
      default: '100%'
    },
    InputType: {
      type: String,
      default: 'text'
    },
    InputId: {
      type: String
    },
    InputPlaceholder: {
      type: String,
      default: 'Type here'
    },
    InvalidText: {
      type: String,
      default: 'Invalid'
    },
    LabelContent: {
      type: String,
      default: 'Label'
    },
    LabelFontSize: {
      type: Number
    },
    LabelFontColor: {
      type: String
    },
    FontType: {
      type: String
    }
  }
}
</script>

<style>

</style>
