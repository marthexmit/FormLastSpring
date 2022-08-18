<template>
  <div class="success-container">
    <TextComponent id="title" newtext="Your data has been sent successfully!" />
    <div class="success-content">
      <p v-if="this.fullname !== ''">Full Name:</p>
      <TextComponent v-if="this.fullname" :newtext="this.fullname" />
      <p v-if="this.email">Email:</p>
      <TextComponent v-if="this.email" :newtext="this.email" />
      <p v-if="this.birthday">Birthday:</p>
      <TextComponent v-if="this.birthday" :newtext="this.birthday"/>
      <p v-if="this.age">Age:</p>
      <TextComponent v-if="this.age" :newtext="this.age" />
      <p v-if="this.github">Github:</p>
      <TextComponent v-if="this.github" :newtext="this.github" />
      <p v-if="this.certificates">Certificates:</p>
      <TextComponent v-if="this.certificates" :newtext="this.certificates" />
      <p v-if="this.teamname">TeamName:</p>
      <TextComponent v-if="this.teamname" :newtext="this.teamname" />
      <p v-if="this.institution">Institution:</p>
      <TextComponent v-if="this.institution" :newtext="this.institution" />
      <p v-if="this.graduation">Graduation:</p>
      <TextComponent v-if="this.graduation" :newtext="this.graduation" />
    </div>
  </div>
</template>

<script>
import TextComponent from '@/components/Micro/TextComponent/TextComponent.vue'
export default {
  name: 'Social',
  components: {
    TextComponent
  },
  data () {
    return {
      fullname: localStorage.getItem('fullname'),
      email: localStorage.getItem('email'),
      birthday: [localStorage.getItem('day'), localStorage.getItem('month'), localStorage.getItem('year')].join('/'),
      age: localStorage.getItem('age'),
      github: localStorage.getItem('github'),
      certificates: localStorage.getItem('certificates'),
      teamname: localStorage.getItem('teamname'),
      institution: localStorage.getItem('institution'),
      graduation: localStorage.getItem('graduation')
    }
  }
}
</script>

<style lang="scss" scoped>
#title {
  text-align: center;
}

.success-content {
  display: grid;
  grid-template-columns: 25% 75%;
  row-gap: 10px;

  p {
    margin: 0;
  }
}

</style>
