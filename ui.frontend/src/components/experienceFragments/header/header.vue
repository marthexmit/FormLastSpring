<template>
     <div id="divHeader">
    <section class="sectionTitle">
      <Title :type="headerType"  smallTitle="smallTitle" :tMessage="headerText" :fontFamily="headerFont" :colorField="headerColor" />
      <Title v-if="this.$store.state.actualTab === 'basic'"  :type="headerTypeTabs" blueTitle="blueTitle" :tMessage="headerTextTabs" :fontFamily="headerFontTabs" :colorField="headerColorTabs" />
      <Title v-if="this.$store.state.actualTab === 'social'"  :type="headerTypeTabs" blueTitle="blueTitle" :tMessage="headerTextTabs" :fontFamily="headerFontTabs" :colorField="headerColorTabs" />
      <Title v-if="this.$store.state.actualTab === 'certificates'"  :type="headerTypeTabs" blueTitle="blueTitle" :tMessage="headerTextTabs" :fontFamily="headerFontTabs" :colorField="headerColorTabs" />
      <Title v-if="this.$store.state.actualTab === 'success'"  :type="headerTypeTabs" blueTitle="blueTitle" :tMessage="headerTextTabs" :fontFamily="headerFontTabs" :colorField="headerColorTabs" />
    </section>
  </div>
</template>

<script>
import Title from '@/components/Micro/Title/Title.vue'
export default {
  // eslint-disable-next-line
    name: 'headercomponent',
  components: {
    Title
  },
  props: {
    headerFontTabs: {
      type: String,
      default: 'Inter'
    },
    headerColorTabs: {
      type: String,
      default: '#074EE8'
    },
    headerTypeTabs: {
      type: String,
      default: 'h2'
    },
    headerTextTabs: {
      type: String,
      default: 'First Tab'
    },
    headerType: {
      type: String,
      default: 'h1'
    },
    headerText: {
      type: String,
      default: 'Forms'
    },
    headerFont: {
      type: String,
      default: 'Inter'
    },
    headerColor: {
      type: String,
      default: '#111111'
    }
  }
}
</script>

<style lang="scss" scoped>
@import url('https://fonts.googleapis.com/css2?family=Inter:wght@400;700&family=Nunito:ital,wght@0,400;0,700;1,400;1,700&display=swap');
@import './header.scss'
</style>
