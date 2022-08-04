<template>
  <p :style="{ 'font-family': fontFamilyText, 'color': colorFieldText,}">{{ newtext }}</p>
</template>

<script>
export default {
  name: 'TextComponent',
  props: {
    newtext: {
      type: String
    },
    fontFamilyText: {
      type: String
    },
    colorFieldText: {
      type: String
    }
  }
}
</script>

<style lang="scss" scoped>
@import './TextComponent.scss'
</style>
