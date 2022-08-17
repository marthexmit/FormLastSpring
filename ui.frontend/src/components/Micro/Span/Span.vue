<template>
  <span>
    <slot>{{ InvalidText }}</slot>
  </span>
</template>

<script>
export default {
  name: 'Span',
  props: {
    InvalidText: {
      type: String,
      default: 'Invalid'
    }
  }
}
</script>

<style lang="scss" scoped>
@import './Span.scss';
</style>
