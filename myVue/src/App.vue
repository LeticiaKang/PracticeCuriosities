<template>
  <ul>
    <h2 v-for="item in items" v-bind:key="item.name">
      {{ item.name }}의 가격은 {{ item.price }}원이고, 재고는 {{ item.quantity }} 남아있다.  
    </h2>
</ul>
</template>

<!-- Composition API 방식-->
<!-- <script>
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
</script> -->


<!-- Options API 방식 -->
<script>
export default {
  data() {
    return {
      message: "Hello",
      items: [
        { name: '일번', price: 1000, quantity: 111 },
        { name: '이번', price: 2000, quantity: 222 },
        { name: '삼번', price: 3000, quantity: 333 },
      ],
    };
  },
};
</script>