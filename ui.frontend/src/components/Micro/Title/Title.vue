<template>
    <div>
        <h1 v-if="type === 'h1'" :style="{ 'font-family': fontFamily, 'color': colorField,}">{{ tMessage }}</h1>
        <h2 v-else-if="type === 'h2'" :style="{ 'font-family': fontFamily, 'color': colorField,}">{{ tMessage }}</h2>
        <h3 v-else-if="type === 'h3'" :style="{ 'font-family': fontFamily, 'color': colorField,}">{{ tMessage }}</h3>
        <h4 v-else-if="type === 'h4'" :style="{ 'font-family': fontFamily, 'color': colorField,}">{{ tMessage }}</h4>
        <h5 v-else-if="type === 'h5'" :style="{ 'font-family': fontFamily, 'color': colorField,}">{{ tMessage }}</h5>
        <h6 v-else-if="type === 'h6'" :style="{ 'font-family': fontFamily, 'color': colorField,}">{{ tMessage }}</h6>
    </div>
</template>

<script>
export default {
  // eslint-disable-next-line
    name: "Title",
  props: {
    type: {
      type: String
    },
    tMessage: {
      type: String
    },
    fontFamily: {
      type: String
    },
    colorField: {
      type: String
    }
  }
}
</script>

<style lang="scss" scoped>
@import './Title.scss'
</style>
