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
// 앱 인스턴스는 .mount() 메서드가 호출될 때까지 아무 것도 렌더링하지 않는다.
app.mount('#app')
