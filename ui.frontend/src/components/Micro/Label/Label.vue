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
        LabelTextContent: {
            type: String,
            default: 'Label'
        },
        LabelFontColor: {
            type: String,
            default: ''
        },
        LabelFontSize: {
            type: String,
            default: 16
        },
        LabelFontFamily: {
            type: String,
            default: 'Nunito'
        }
    }
}
</script>

<style lang="scss" scoped>

</style>