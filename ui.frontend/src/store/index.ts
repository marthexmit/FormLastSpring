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
  mutations: {
    changeActualTab (state, newTab) {
      state.actualTab = newTab
    }
  },
  actions: {
    changeActualTab ({ commit }, newTab) {
      commit('changeActualTab', newTab)
    }
  },
  modules: {}
})

export default store
