import Vue from 'vue'
import Vuex, { Store } from 'vuex'

Vue.use(Vuex)

const store = new Store({
  state: {
    exemplo: 'Exemplo de Vuex'
  },
  getters: {},
  mutations: {},
  actions: {},
  modules: {}
})

export default store