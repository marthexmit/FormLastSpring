<template>
    <div :class="classes">
        <p>Success</p>
    </div>
</template>

<script>
export default {
  name: 'Social',
  props: {
    classes: {
      type: Array,
      default: () => ['basic', 'main', 'high']
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
