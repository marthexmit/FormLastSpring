<template>
  <button :style="{ 'font-family': fontFamilyButton, 'background-color': backColorButton, 'color': colorFieldButton}" v-on:click="clickButton">{{ Btext }}</button>
</template>

<script>
export default {
  name: 'ButtonComponent',
  props: {
    Btext: {
      type: String
    },
    backColorButton: {
      type: String
    },
    fontFamilyButton: {
      type: String
    },
    colorFieldButton: {
      type: String
    },
    clickButton: {
      type: Function,
      required: true
    }
  }
}
</script>

<style>
</style>
