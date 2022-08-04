<template>
    <label
        :for="ForInput"
        :class="LabelClasses">
        <slot>{{ LabelContent }}</slot>
    </label>
</template>

<script>
export default {
    name: 'Label',
    props: {
        ForInput: {
            type: String,
            default: ''
        },
        LabelClasses: {
            type: Array,
            default: () => ['default']
        },
        LabelContent: {
            type: String,
            default: 'Label'
        }
    }
}
</script>

<style lang="scss" scoped>

</style>