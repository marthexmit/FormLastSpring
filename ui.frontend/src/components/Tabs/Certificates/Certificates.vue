<template>
    <div :class="classes">
        <p>Certificates</p>
    </div>
</template>

<script>
export default {
  name: 'Certificates',
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
