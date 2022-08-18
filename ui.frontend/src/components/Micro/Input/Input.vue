<template>
    <input
        :type="InputType"
        :value="InputValue"
        :placeholder="InputPlaceholder"
        @input="getInputValue"/>
</template>

<script>
import $ from 'jquery'
import {} from 'jquery-mask-plugin'
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
  mounted () {
    if (this.InputType === 'tel') {
      $('input[type="tel"]').mask('(00) 00000-0000')
    }
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
