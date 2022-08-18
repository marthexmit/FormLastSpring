<template>
  <div class="success-container">
    <div class="success-content">
      <TextComponent id="title" newtext="Your data has been sent successfully!" />
      <TextComponent v-if="this.fullname" cText='Full Name: ' :newtext="this.fullname" />
      <TextComponent v-if="this.email" cText='Email: ' :newtext="this.email" />
      <TextComponent v-if="this.birthday" cText='Birthday: ' :newtext="this.birthday" />
      <TextComponent v-if="this.age" cText="Age: " :newtext="this.age" />
      <TextComponent v-if="this.github" cText="Github: " :newtext="this.github" />
      <div class="certificates-presentation">
        <TextComponent v-if="this.certificates" cText="Certificates: " />
        <div v-if="this.certificates">
          <TextComponent v-for="(certificate, i) in getCertificatesList()" :key="i" :newtext="certificate" />
        </div>
      </div>
      <TextComponent v-if="this.teamname" cText="Teamname: " :newtext="this.teamname" />
      <TextComponent v-if="this.institution" cText="Institution: " :newtext="this.institution" />
      <TextComponent v-if="this.graduation" cText="Graduation: " :newtext="this.graduation" />
    </div>
    <div class="Breturn">
      <ButtonComponent type="5" Btext="Return" :clickButton="clearLocalStorage" />
    </div>
  </div>

</template>

<script>
import TextComponent from '@/components/Micro/TextComponent/TextComponent.vue'
import ButtonComponent from '@/components/Micro/Button/Button.vue'
export default {
  name: 'Social',
  components: {
    TextComponent,
    ButtonComponent
  },
  data () {
    return {
      fullname: localStorage.getItem('fullname'),
      email: localStorage.getItem('email'),
      birthday: [localStorage.getItem('day'), localStorage.getItem('month'), localStorage.getItem('year')].join('/'),
      age: localStorage.getItem('age'),
      github: localStorage.getItem('github'),
      certificates: JSON.parse(localStorage.getItem('certificates')),
      teamname: localStorage.getItem('teamname'),
      institution: localStorage.getItem('institution'),
      graduation: localStorage.getItem('graduation')
    }
  },
  methods: {
    clearLocalStorage () {
      localStorage.clear()
      this.$store.state.abledTabs = ['basic']
      this.$store.state.actualTab = 'basic'
    },
    getCertificatesList () {
      return JSON.parse(localStorage.getItem('certificates'))
    }
  }
}
</script>

<style lang="scss" scoped>
@import './Success.scss';
</style>
