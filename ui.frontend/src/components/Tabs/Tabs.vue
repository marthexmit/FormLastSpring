<template>
  <main>
    <div class="card">
      <template v-if="actualTab !== 'success'">
        <h2 class="teamSign">Team Sign Up</h2>
        <Menu />

        <template v-if="getActualTab === 'basic'">
          <Basic
                    :FullNameFontType="FullNameFontType"
                    :FullNameFontSize="FullNameFontSize"
                    :FullNameLabelColor="FullNameLabelColor"
                    :FullNamePlaceholder="FullNamePlaceholder"
                    :FullNameInvalidText="FullNameInvalidText"
                    :FullNameLabel="FullNameLabel"
                    :NicknameFontType="NicknameFontType"
                    :NicknameFontSize="NicknameFontSize"
                    :NicknameLabelColor="NicknameLabelColor"
                    :NicknamePlaceholder="NicknamePlaceholder"
                    :NicknameLabel="NicknameLabel"
                    :EmailFontType="EmailFontType"
                    :EmailFontSize="EmailFontSize"
                    :EmailLabelColor="EmailLabelColor"
                    :EmailPlaceholder="EmailPlaceholder"
                    :EmailInvalidText="EmailInvalidText"
                    :EmailLabel="EmailLabel"
                    :PhoneFontType="PhoneFontType"
                    :PhoneFontSize="PhoneFontSize"
                    :PhoneLabelColor="PhoneLabelColor"
                    :PhonePlaceholder="PhonePlaceholder"
                    :PhoneLabel="PhoneLabel"
                    />
          <!-- <Basic /> -->
        </template>

        <template v-else-if="getActualTab === 'social'">
          <Social />
        </template>

        <template v-else-if="getActualTab === 'certificates'">
          <Certificates />
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
  name: "Tabs",
  props: {
    FullNameFontType: {
      type: String,
      default: 'Nunito'
    },
    FullNameFontSize: {
      type: Number,
      default: 16
    },
    FullNameLabelColor: {
      type: String,
      default: '#767676'
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
    NicknameFontType: {
      type: String,
      default: 'Nunito'
    },
    NicknameFontSize: {
      type: Number,
      default: 16
    },
    NicknameLabelColor: {
      type: String,
      default: '#767676'
    },
    NicknamePlaceholder: {
      type: String,
      default: 'Juanito'
    },
    NicknameLabel: {
      type: String,
      default: 'Nickname'
    },
    EmailFontType: {
      type: String,
      default: 'Nunito'
    },
    EmailFontSize: {
      type: Number,
      default: 16
    },
    EmailLabelColor: {
      type: String,
      default: '#767676'
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
    PhoneFontType: {
      type: String,
      default: 'Nunito'
    },
    PhoneFontSize: {
      type: Number,
      default: 16
    },
    PhoneLabelColor: {
      type: String,
      default: '#767676'
    },
    PhonePlaceholder: {
      type: String,
      default: '(83) 00000-0000'
    },
    PhoneLabel: {
      type: String,
      default: 'Phone'
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
@import "./Tabs.scss";
</style>
