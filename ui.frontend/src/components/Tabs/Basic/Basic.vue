<template>
  <form>
    <FormField v-for="(field, index) in fields" :key="index" :field="field"/>
    <Checkbox />
  </form>
</template>

<script>
import Checkbox from '@/components/FormFields/Checkbox/Checkbox.vue'
import FormField from '@/components/FormFields/FormField.vue'
export default {
  name: 'Basic',
  components: {
    FormField,
    Checkbox
  },
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

form {
  display: flex;
  flex-wrap: wrap;
}
</style>
