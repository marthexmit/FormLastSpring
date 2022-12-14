import Vue from 'vue'
import Vuex, { Store } from 'vuex'

Vue.use(Vuex)

const store = new Store({
  state: {
    menuTabs: ['basic', 'social', 'certificates'],
    abledTabs: ['basic'],
    actualTab: 'basic'
  },
  getters: {},
  mutations: {
    changeActualTab (state, newTab) {
      state.actualTab = newTab
    },
    nextTab (state) {
      if (state.actualTab !== 'certificates') {
        if (
          state.menuTabs.indexOf(state.actualTab) + 1 !==
          state.menuTabs.length
        ) {
          state.abledTabs.push(
            state.menuTabs[state.menuTabs.indexOf(state.actualTab) + 1]
          )
          state.actualTab = state.abledTabs[state.abledTabs.length - 1]
        }
      } else {
        state.actualTab = 'success'
      }
    }
  },
  actions: {
    changeActualTab ({ commit }, newTab) {
      commit('changeActualTab', newTab)
    },
    nextTab ({ commit }) {
      commit('nextTab')
    }
  },
  modules: {}
})

export default store
