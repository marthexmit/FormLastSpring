<template>
  <button :style="{ 'font-family': fontFamilyButton, 'background-color': backColorButton, 'color': colorFieldButton}">{{ Btext }}</button>
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
    }
  }
}
</script>

<style>
</style>
