<template>
  <main>
    <div class="card">
      <template v-if="actualTab !== 'success'">
        <h2 class="teamSign">{{ FormTitle }}</h2>
        <Menu />

        <template v-if="getActualTab === 'basic'">
          <Basic
                    :FontType="FontType"
                    :FontColor="FontColor"
                    :FontSize="FontSize"
                    :InputStyle="InputStyle"
                    :FullNamePlaceholder="FullNamePlaceholder"
                    :FullNameInvalidText="FullNameInvalidText"
                    :FullNameLabel="FullNameLabel"
                    :NicknamePlaceholder="NicknamePlaceholder"
                    :NicknameLabel="NicknameLabel"
                    :EmailPlaceholder="EmailPlaceholder"
                    :EmailInvalidText="EmailInvalidText"
                    :EmailLabel="EmailLabel"
                    :PhonePlaceholder="PhonePlaceholder"
                    :PhoneLabel="PhoneLabel"
                    />
        </template>

        <template v-else-if="getActualTab === 'social'">
          <Social
                    :FontType="FontType"
                    :FontColor="FontColor"
                    :FontSize="FontSize"
                    :InputStyle="InputStyle"
                    :LinkedinPlaceholder="LinkedinPlaceholder"
                    :LinkedinLabel="LinkedinLabel"
                    :GithubPlaceholder="GithubPlaceholder"
                    :GithubInvalidText="GithubInvalidText"
                    :GithubLabel="GithubLabel"
                    />
        </template>

        <template v-else-if="getActualTab === 'certificates'">
          <Certificates
                    :FontType="FontType"
                    :FontColor="FontColor"
                    :FontSize="FontSize"
                    :InputStyle="InputStyle"
                    :CertificatesPlaceholder="CertificatesPlaceholder"
                    :CertificatesLabel="CertificatesLabel"
                    :TeamNamePlaceholder="TeamNamePlaceholder"
                    :TeamNameInvalidText="TeamNameInvalidText"
                    :TeamNameLabel="TeamNameLabel"
                    :InstitutionPlaceholder="InstitutionPlaceholder"
                    :InstitutionInvalidText="InstitutionInvalidText"
                    :InstitutionLabel="InstitutionLabel"
                    :GraduationPlaceholder="GraduationPlaceholder"
                    :GraduationInvalidText="GraduationInvalidText"
                    :GraduationLabel="GraduationLabel"
                    />
        </template>
      </template>

      <template v-else-if="getActualTab === 'success'">
        <Success />
      </template>
    </div>
  </main>
</template>

<script>
import Menu from '@/components/Menu/Menu.vue'
import { mapActions } from 'vuex'
import Social from '@/components/Tabs/Social/Social.vue'
import Basic from '@/components/Tabs/Basic/Basic.vue'
import Certificates from '@/components/Tabs/Certificates/Certificates.vue'
import Success from '@/components/Tabs/Success/Success.vue'
export default {
  // eslint-disable-next-line
  name: 'Tabs',
  props: {
    FormTitle: {
      type: String,
      default: 'Team Sign Up'
    },
    FontType: {
      type: String,
      default: 'Nunito'
    },
    FontColor: {
      type: String,
      default: '#767676'
    },
    FontSize: {
      type: Number,
      default: 16
    },
    InputStyle: {
      type: String,
      default: 'primary'
    },
    FullNamePlaceholder: {
      type: String,
      default: 'Foo Bar'
    },
    FullNameInvalidText: {
      type: String,
      default: 'Please enter your Name'
    },
    FullNameLabel: {
      type: String,
      default: 'Full Name'
    },
    NicknamePlaceholder: {
      type: String,
      default: 'Juanito'
    },
    NicknameLabel: {
      type: String,
      default: 'Nickname'
    },
    EmailPlaceholder: {
      type: String,
      default: 'foo@bar.com'
    },
    EmailInvalidText: {
      type: String,
      default: 'Please enter your Email'
    },
    EmailLabel: {
      type: String,
      default: 'Email'
    },
    PhonePlaceholder: {
      type: String,
      default: '(83) 00000-0000'
    },
    PhoneLabel: {
      type: String,
      default: 'Phone'
    },
    LinkedinPlaceholder: {
      type: String,
      default: 'https://www.linkedin.com/in/foo-bar-3a0560104/'
    },
    LinkedinLabel: {
      type: String,
      default: 'Linkedin'
    },
    GithubPlaceholder: {
      type: String,
      default: 'https://github.com/foobar'
    },
    GithubInvalidText: {
      type: String,
      default: 'Please enter your GitHub link'
    },
    GithubLabel: {
      type: String,
      default: 'GitHub'
    },
    CertificatesPlaceholder: {
      type: String,
      default: 'https://www.linkedin.com/in/foo-bar-3a0560104/'
    },
    CertificatesLabel: {
      type: String,
      default: 'Certificates'
    },
    GraduationPlaceholder: {
      type: String,
      default: 'Ciência da Computação'
    },
    GraduationInvalidText: {
      type: String,
      default: 'Please entre your Graduation'
    },
    GraduationLabel: {
      type: String,
      default: 'Graduation'
    },
    TeamNamePlaceholder: {
      type: String,
      default: 'https://www.linkedin.com/in/foo-bar-3a0560104/'
    },
    TeamNameInvalidText: {
      type: String,
      default: 'Please entre your Team Name'
    },
    TeamNameLabel: {
      type: String,
      default: 'Team Name'
    },
    InstitutionPlaceholder: {
      type: String,
      default: 'Universidade Regional Integrada'
    },
    InstitutionInvalidText: {
      type: String,
      default: 'Please entre your Institution'
    },
    InstitutionLabel: {
      type: String,
      default: 'Institution'
    }
  },
  data () {
    return {
      actualTab: this.$store.state.actualTab
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
  components: { Menu, Social, Basic, Certificates, Success },
  methods: {
    ...mapActions(['nextTab'])
  }
}
</script>

<style lang="scss" scoped>
@import './Tabs.scss';
</style>
