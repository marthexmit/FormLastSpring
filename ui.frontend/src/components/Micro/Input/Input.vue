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
    name: 'Label',
  props: {
    InputType: {
      type: String
    },
    InputValue: {
      type: String
    },
    InputPlaceholder: {
      type: String
    }
  },
  methods: {
    getInputValue (e) {
      console.log(e.target.value)
    }
  }
}
</script>

<style lang="scss" scoped>
@import './Input.scss';
</style>
