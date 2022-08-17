<template>
    <input
        :type="InputType"
        :value="InputValue"
        :placeholder="InputPlaceholder"
        @input="getInputValue"/>
</template>

<script>
export default {
  // eslint-disable-next-line
  name: 'Input',
  props: {
    InputType: {
      type: String
    },
    InputValue: {
      type: String
    },
    InputPlaceholder: {
      type: String
    },
    Storage: String
  },
  methods: {
    getInputValue (e) {
      localStorage.setItem(this.Storage, e.target.value)
    }
  }
}
</script>

<style lang="scss" scoped>
@import './Input.scss';
</style>
