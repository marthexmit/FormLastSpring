<template>
  <FullName v-if="field.InputType === 'fullname'"
            :fieldProps="field"
  />
  <Birthday v-else-if="field.InputType === 'birthday'"
            :fieldProps="field"
  />
  <DefaultField v-else :fieldProps="field"/>
</template>

<script>
import FullName from '@/components/FormFields/FullName/FullName.vue'
import DefaultField from '@/components/FormFields/DefaultField/DefaultField.vue'
import Birthday from '@/components/FormFields/Birthday/Birthday.vue'
export default {
  name: 'FormField',
  components: {
    FullName,
    DefaultField,
    Birthday
  },
  props: {
    field: {
      type: Object
    }
  }
}
</script>

<style>

</style>
