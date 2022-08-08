<template>
  <button :style="{ 'font-family': fontFamilyButton, 'background-color': backColorButton, 'color': colorFieldButton}" @click.prevent="event">{{ Btext }}</button>
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
    event: {
      type: Function,
      required: true
    }
  }
}
</script>

<style>
</style>
