import { createApp } from 'vue'   
import App from './App.vue'       // 
import router from './router'     // router 폴터 안에 index.js가 import 된다. 

createApp(App).use(router).mount('#app')   
// 최상위 컴포넌트 App.vue로 app을 생성 → use코드를 추가하여 App.vue에서 router가 사용될 수 있도록 추가 → public폴더의 index.html에 정의되어 있는 id="app"인 html element에 마운트
