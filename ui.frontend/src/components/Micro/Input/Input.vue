<template>
    <input 
        :type="InputType" 
        :value="InputValue" 
        :class="InputClasses" 
        :placeholder="InputPlaceholder"
        @input="getInputValue">
</template>

<script>
export default {
    name: 'Label',
    props: {
        InputType: {
            type: String,
            default: 'text'
        },
        InputValue: {
            type: String,
            default: ''
        },
        InputClasses: {
            type: Array,
            default: () => ['default']
        },
        InputPlaceholder: {
            type: String,
            default: 'Type here'
        }
    },
    methods: {
        getInputValue(e) {
            console.log(e.target.value);
        }
    }
}
</script>

<style lang="scss" scoped>
@import './Input.scss';
</style>
