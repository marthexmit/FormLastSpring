<template>
  <button  class="BclassBasic"  v-if="type === '0'" :style="{ 'font-family': fontFamilyButton, 'background-color': backColorButton, 'color': colorFieldButton}" @click.prevent="clickButton">{{ Btext }} <img src="/content/dam/vue/VectorSetaDireita.png" alt="next image" /></button>
  <button  class="BclassSocial"  v-else-if="type === '1'" :style="{ 'font-family': fontFamilyButton, 'background-color': backColorButton, 'color': colorFieldButton}" @click.prevent="clickButton">{{ Btext }} <img src="/content/dam/vue/VectorSetaDireita.png" alt="next image" /></button>
  <button  class="BclassCertificates"  v-else-if="type === '2'" :style="{ 'font-family': fontFamilyButton, 'background-color': backColorButton, 'color': colorFieldButton}" @click.prevent="clickButton"> <img src="/content/dam/vue/CertinFinish.png" alt="next image" /> {{ Btext }}</button>
  <button  class="BclassCertificatesMore"  v-else-if="type === '3'" :style="{ 'font-family': fontFamilyButton, 'background-color': backColorButton, 'color': colorFieldButton}" @click.prevent="clickButton"> <img class="plus" src="/content/dam/vue/MoreMais.png" alt="next image" /> {{ Btext }} <img src="/content/dam/vue/VectorSetaDireita.png" alt="next image" /></button>
  <button  class="BclassCertificatesList"  v-else-if="type === '4'" :style="{ 'font-family': fontFamilyButton, 'background-color': backColorButton, 'color': colorFieldButton}" @click.prevent="clickButton">{{ Btext }} <img src="/content/dam/vue/seta_Baixo.png" alt="next image" /></button>
  <button  class="BclassSuccess"  v-else-if="type === '5'" :style="{ 'font-family': fontFamilyButton, 'background-color': backColorButton, 'color': colorFieldButton}" @click.prevent="clickButton"><img src="/content/dam/vue/CertinFinish.png" alt="next image" /> {{ Btext }} </button>
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
