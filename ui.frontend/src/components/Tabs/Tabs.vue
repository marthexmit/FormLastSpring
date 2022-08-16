<template>
  <div class="card">
    <template v-if="actualTab !== 'success'">
      <h2 class="teamSign">Team Sign Up</h2>
      <Menu />

      <template v-if="getActualTab === 'basic'">
        <Basic :fields="BasicFields" />
      </template>

      <template v-else-if="getActualTab === 'social'">
        <Social :fields="SocialFields" />
      </template>

      <template v-else-if="getActualTab === 'certificates'">
        <Certificates :fields="CertificatesFields"/>
      </template>
    </template>

    <template v-else-if="getActualTab === 'success'">
      <Success />
    </template>
  </div>
</template>

<script>
import Menu from '@/components/Menu/Menu.vue'
import Social from '@/components/Tabs/Social/Social.vue'
import Basic from '@/components/Tabs/Basic/Basic.vue'
import Certificates from '@/components/Tabs/Certificates/Certificates.vue'
import Success from '@/components/Tabs/Success/Success.vue'
export default {
  // eslint-disable-next-line
  name: "Tabs",
  data () {
    return {
      actualTab: this.$store.state.actualTab,
      BasicFields: [
        {
          InputId: 'fullname',
          InputType: 'text',
          InputValue: '',
          LabelContent: 'Full Name',
          InvalidText: '',
          InputPlaceholder: 'Foo Bar',
          FieldSize: '50%'
        },
        {
          InputId: 'nickname',
          InputType: 'text',
          LabelContent: 'Nickname',
          InputValue: '',
          InvalidText: 'Invalid',
          InputPlaceholder: 'foo_bar',
          FieldSize: '50%'
        },
        {
          InputId: 'email',
          InputType: 'email',
          LabelContent: 'Email',
          InputValue: '',
          InvalidText: 'Invalid',
          InputPlaceholder: 'foo@bar.com',
          FieldSize: '40%'
        },
        {
          InputId: 'phone',
          InputType: 'tel',
          LabelContent: 'Phone',
          InputValue: '',
          InvalidText: 'Invalid',
          InputPlaceholder: '(00) 00000-0000',
          FieldSize: '60%'
        },
        {
          InputId: 'birthday',
          InputType: 'birthday',
          LabelContent: 'Birthday',
          InputValue: '',
          InvalidText: 'Invalid',
          InputPlaceholder: '',
          FieldSize: '100%'
        }
      ],
      SocialFields: [
        {
          ForInput: 'linkedin',
          InputType: 'text',
          LabelContent: 'Linkedin',
          InputPlaceholder: 'https://lindedin.com/in'
        },
        {
          ForInput: 'github',
          InputType: 'text',
          LabelContent: 'GitHub',
          InputPlaceholder: 'https://github.com/user'
        }
      ]
    }
  },
  beforeUpdate () {
    this.actualTab = this.$store.state.actualTab
  },
  computed: {
    getActualTab () {
      return this.$store.state.actualTab
    }
  },
  components: {
    Menu,
    Social,
    Basic,
    Certificates,
    Success
  }
}
</script>

<style lang="scss" scoped>
@import "./Tabs.scss";
</style>
