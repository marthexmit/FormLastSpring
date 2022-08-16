<template>
  <div :style="{ width: fieldProps.FieldSize }">
    <Label :ForInput="fieldProps.InputId">{{ fieldProps.LabelContent }}</label>
    <TextComponent :newtext="fieldProps.InvalidText"/>

    <Input
      :InputType="fieldProps.InputType"
      :InputPlaceholder="fieldProps.InputPlaceholder"
      :InputId="fieldProps.InputId"
      @input="getValue"
      :InputValue="fieldProps.InputValue"
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
    fieldProps: {
      type: Object
    }
  }
}
</script>

<style>

</style>
