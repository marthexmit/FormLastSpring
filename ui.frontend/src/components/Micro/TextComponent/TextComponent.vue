<template>
  <p :style="{ 'font-family': fontFamilyText, 'color': colorFieldText }">{{cText}} {{ newtext }}</p>
</template>

<script>
export default {
  name: 'TextComponent',
  props: {
    cText: {
      type: String
    },
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
@import './TextComponent.scss';
</style>
