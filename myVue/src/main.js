import './assets/main.css'

import { createApp } from 'vue'
import { createPinia } from 'pinia'

import App from './App.vue'
import router from './router'

// Composition API 01. vue 인스턴스 생성
//   → 인스턴스를 DOM 요소에 마운트하여 요소 안에서 Vue의 기능을 사용할 수 있다.
const app = createApp(App)

app.use(createPinia())
app.use(router)

// Composition API 02. vue 인스턴스 마운트 정의
app.mount('#app')
