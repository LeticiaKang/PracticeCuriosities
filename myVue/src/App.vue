<!-- Options API -->
<template>
  <div id="app">
    <ul>
      <!-- v-bind 속성-->
      <li v-for="item in items" :key="item.name">
        <!-- 아이디, 클래스, 스타일 등의 HTML 속성 값에 뷰 데이터 값을 연결 -->
        {{ item.name }}의 가격은 {{ item.price }}원이고, 재고는 {{ item.quantity }}개 남아있다.
      </li>
    </ul>
  </div>
</template>

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