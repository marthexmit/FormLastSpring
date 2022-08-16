import Vue from 'vue'
import Vuex, { Store } from 'vuex'

Vue.use(Vuex)

const store = new Store({
  state: {
    menuTabs: ['basic', 'social', 'certificates'],
    abledTabs: ['basic', 'social', 'certificates'],
    actualTab: 'basic'
  },
  getters: {},
  mutations: {},
  actions: {},
  modules: {}
})

export default store
