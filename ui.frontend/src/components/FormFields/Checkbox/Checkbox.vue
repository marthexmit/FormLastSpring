<template>
  <div id="main-check">
    <label class="container">I accept the terms and privacy

      <div class="reverse">
        <input type="checkbox" name="terms" class="chk" id="checkbox" required :checked="status" @change="getValue" />
        <span class="check"></span>
      </div>
    </label>
    <div id="validation-checkbox" style="display: none">
      <Span>Please confirm the terms</Span>
    </div>
  </div>
</template>

<script>
import Span from '@/components/Micro/Span/Span.vue'
export default {
  // eslint-disable-next-line
  name: "Checkbox",
  components: {
    Span
  },
  data () {
    return {
      status: null
    }
  },
  mounted () {
    if (JSON.parse(window.localStorage.getItem('terms')) !== null) {
      this.status = JSON.parse(window.localStorage.getItem('terms'))
    } else {
      this.status = true
      window.localStorage.setItem('terms', this.status)
    }
  },
  methods: {
    getValue (e) {
      if (e.target.checked) {
        localStorage.setItem('terms', true)
      } else {
        localStorage.setItem('terms', false)
      }
    }
  }
}
</script>

<style lang="scss" scooped>
@import "./Checkbox.scss";
</style>
