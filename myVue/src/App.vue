<!-- Options API  -->
<template>
  <ul>
    <li v-for="item in items" v-bind:key="item.name">
      <!-- {{ item.name }}의 가격: <input type="text" v-on:input="item.price = $event.target.value" v-bind:value="item.price"> -->
      {{ item.name }}의 가격: <input type="text" :value="item.price" @input="updatePrice(item, $event)">
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
export default {

  data() {
    return {
      items: [
        { name: 'CPU', price: 462984, quantity: 1 },
        { name: '메인보드', price: 112053, quantity: 1 },
        { name: '메모리', price: 79608, quantity: 2 }
      ],
    };
  },

  computed: {
    // computed 속성을 사용하여 총합 계산
    totalPrice() {
      return this.items.reduce((sum, item) => sum + item.price * item.quantity, 0);
    }
  },

  methods: {
    // 입력 필드를 통해 price를 업데이트하는 메소드
    updatePrice(item, event) {
      // 입력된 값을 숫자로 변환하여 item.price에 할당
      item.price = Number(event.target.value);
    }
  }
  
};
</script>