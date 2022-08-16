<template>
  <div class="fullname-container" :style="{ width: fieldProps.FieldSize }">
    <Label ForInput="fullname">{{ fieldProps.LabelContent }}</label>
    <TextComponent :newtext="fieldProps.InvalidText" />

    <Input
      InputType="text"
      :InputPlaceholder="fieldProps.InputPlaceholder"
      InputId="fullname"
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
  name: 'FullName',
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

<style scoped>
</style>
