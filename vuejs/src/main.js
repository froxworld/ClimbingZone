import Vue from 'vue'
import App from './App.vue'
// import app5 from 'components.app5.js'

Vue.config.productionTip = false

new Vue({
  render: h => h(App),
}).$mount('#app')

