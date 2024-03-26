<!-- Composition API  -->
<template>
  <ul>
    <li v-for="item in items" v-bind:key="item.name">
      {{ item.name }}의 가격: <input type="text" v-model="item.price">
    </li> 
  </ul> 
  <br>
  <div>
    <ul>
      <li v-for="item in items" v-bind:key="item.name">
      {{ item.name }}: {{ item.price }} x {{ item.quantity }} = {{ item.price * item.quantity }} 원
      </li>
    </ul>
    <br>
    <p>▷ 합계: {{ totalPrice }} 원</p>
  </div>
  <div>
    
  </div>
</template>

<script>
import { ref, computed } from 'vue'

export default {
  setup() {
    const items = ref([
      {
        name: 'CPU', price: 462984, quantity: 1
      }, 
      {
        name: '메인보드', price: 112053, quantity: 1
      }, 
      {
        name: '메모리', price: 79608, quantity: 2
      }
    ])
    
    // computed 속성
    const totalPrice = computed(() => {
      return items.value.reduce(function (sum, item) {
        return sum + (item.price * item.quantity)
      }, 0)
    })

    return {
      items,
      totalPrice,
    }
  },
}
</script>