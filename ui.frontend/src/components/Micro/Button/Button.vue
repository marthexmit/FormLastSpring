<template>
  <button  class="BclassBasic"  v-if="type === '0'" :style="{ 'font-family': fontFamilyButton, 'background-color': backColorButton, 'color': colorFieldButton}" @click.prevent="clickButton">{{ Btext }} <img src="/content/dam/vue/VectorSetaDireita.png" alt="next image" /></button>
  <button  class="BclassBasic3"  v-else-if="type === '3'" :style="{ 'font-family': fontFamilyButton, 'background-color': backColorButton, 'color': colorFieldButton}" @click.prevent="clickButton"> <img src="/content/dam/vue/CertinFinish.png" alt="next image" /> {{ Btext }}</button>
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
