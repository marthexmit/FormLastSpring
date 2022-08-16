<template>
    <div>
        <h1 v-if="type === 'h1'" :id = "smallTitle" :style="{ 'font-family': fontFamily, 'color': colorField,}">{{ tMessage }} {{tabNumber}}</h1>
        <h2 v-else-if="type === 'h2'" :id = "blueTitle" :style="{ 'font-family': fontFamily, 'color': colorField,}">{{ tMessage }} {{tabNumber}}</h2>
        <h3 v-else-if="type === 'h3'" :id = "blueTitle" :style="{ 'font-family': fontFamily, 'color': colorField,}">{{ tMessage }} {{tabNumber}}</h3>
        <h4 v-else-if="type === 'h4'" :id = "blueTitle" :style="{ 'font-family': fontFamily, 'color': colorField,}">{{ tMessage }} {{tabNumber}}</h4>
        <h5 v-else-if="type === 'h5'" :id = "blueTitle" :style="{ 'font-family': fontFamily, 'color': colorField,}">{{ tMessage }} {{tabNumber}}</h5>
        <h6 v-else-if="type === 'h6'" :id = "blueTitle" :style="{ 'font-family': fontFamily, 'color': colorField,}">{{ tMessage }} {{tabNumber}}</h6>
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
    },
    tabNumber: {
      type: String
    },
    blueTitle: {
      type: String
    },
    smallTitle: {
      type: String
    }
  }
}
</script>

<style lang="scss" scoped>
@import './Title.scss'
</style>
