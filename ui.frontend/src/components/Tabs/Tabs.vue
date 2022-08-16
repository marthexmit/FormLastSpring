<template>
  <div class="card">
    <template v-if="actualTab !== 'success'">
      <h2 class="teamSign">Team Sign Up</h2>
      <Menu />

      <template v-if="getActualTab === 'basic'">
        <Basic    :FullNamePlaceholder="FullNamePlaceholder"
                  :FullNameInvalid="FullNameInvalid"
                  :FullNameLabelColor="FullNameLabelColor"
                  :FullNameFontSize="FullNameFontSize"
                  :FullNameLabel="FullNameLabel"
                  :FullNameFontType="FullNameFontType" />
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
