<template>
  <div class="fullname-container" :style="{ width: fieldProps.FieldSize }">
    <Label ForInput="fullname">{{ fieldProps.LabelContent }}</label>
    <Span>Full Name invalid</Span>

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
import Label from '@/components/micro/Label/Label.vue'
import Input from '@/components/micro/Input/Input.vue'
import Span from '@/components/micro/Span/Span.vue'
export default {
  name: 'FullName',
  components: {
    Label,
    Input,
    Span
  },
  props: {
    fieldProps: {
      type: Object
    }
  }
}
</script>

<style scoped>
.fullname-container {
    padding: 5px;
    box-sizing: border-box;
}
</style>
