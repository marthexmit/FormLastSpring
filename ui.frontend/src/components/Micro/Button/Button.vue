<template>
  <button  class="BclassBasic"  v-if="type === '0'" :style="{ 'font-family': fontFamilyButton, 'background-color': backColorButton, 'color': colorFieldButton}" @click.prevent="clickButton">{{ Btext }} <img src="/content/dam/vue/VectorSetaDireita.png" alt="next image" /></button>
</template>

<script>
export default {
  name: 'ButtonComponent',
  props: {
    type: {
      type: String
    },
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

<style lang="scss" scoped>
@import './Button.scss'
</style>
