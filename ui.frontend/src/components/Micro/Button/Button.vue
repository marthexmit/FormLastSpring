<template>
  <button :style="{ 'font-family': fontFamilyButton, 'background-color': backColorButton, 'color': colorFieldButton}" @click.prevent="clickButton">{{ Btext }}</button>
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
