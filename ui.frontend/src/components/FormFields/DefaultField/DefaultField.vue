<template>
  <div :style="{ width: FieldSize }" :class="FieldClass + ' default'">
    <Label :style="{ fontSize: FontSize + 'px', color: FontColor, fontFamily: FontType }">{{ LabelContent }}</Label>
    <Span :style="{ fontFamily: FontType, fontSize: FontSize }">{{ InvalidText }}</Span>
    <Input
      :InputType="InputType"
      :InputPlaceholder="InputPlaceholder"
      :Storage="Storage"
      :InputValue="InputValue"
      :style="{ fontFamily: FontType }"
      :InputClasses="InputStyle"
    />
  </div>
</template>

<script>
import Label from '@/components/Micro/Label/Label.vue'
import Input from '@/components/Micro/Input/Input.vue'
import Span from '@/components//Micro/Span/Span.vue'
export default {
  name: 'DefaultField',
  components: {
    Label,
    Input,
    Span
  },
  props: {
    FieldClass: {
      type: String
    },
    FieldSize: {
      type: String
    },
    InputType: {
      type: String,
      default: 'text'
    },
    InputValue: String,
    Storage: {
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
    FontSize: {
      type: Number
    },
    FontColor: {
      type: String
    },
    FontType: {
      type: String
    },
    InputStyle: String
  }
}
</script>

<style lang="scss" scoped>
@import './DefaultField.scss';
</style>
