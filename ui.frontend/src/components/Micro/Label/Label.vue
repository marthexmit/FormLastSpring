<template>
    <label
        :for="ForInput"
        :class="LabelClasses">
        <slot>{{ LabelContent }}</slot>
    </label>
</template>

<script>
export default {
  // eslint-disable-next-line
    name: 'Label',
  props: {
    ForInput: {
      type: String
    },
    LabelClasses: {
      type: Array,
      default: () => ['default']
    },
    LabelTextContent: {
      type: String
    },
    LabelFontColor: {
      type: String
    },
    LabelFontSize: {
      type: String
    },
    LabelFontFamily: {
      type: String
    }
  }
}
</script>

<style lang="scss" scoped>
@import './Label.scss';
</style>
