<!-- Composition API 방식-->
<template>
  <div id="app">
    <ul>
      <li v-for="item in items" :key="item.name">
        {{ item.name }}의 가격은 {{ item.price }}원이고, 재고는 {{ item.quantity }}개 남아있다.
      </li>
    </ul>
  </div>
</template>

<!-- Composition API 방식-->
<script>
// ref 컴포지션 함수 import
import {ref} from 'vue'

export default{
  setup(){
    const message = ref("Hello")
    const items = ref([
      {
        name: '일번', price: 100, quantity: 111
      },
      {
        name: '이번', price: 200, quantity: 222
      },
      {
        name: '삼번', price: 300, quantity: 333
      },
    ])

    return{
      message,
      items,
    }
  },
}
</script>

