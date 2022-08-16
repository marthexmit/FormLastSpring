<template>
    <p>Social</p>
</template>

<script>
export default {
  name: 'Social',
  props: {
    fields: {
      type: Array,
      default: () => []
    }
  }
}
</script>

<style scoped>
.basic {
    background-color: blue;
}
.main {
    color: white;
}
.high {
    font-size: 3em;
}

p {
    text-align: center;
}
</style>
