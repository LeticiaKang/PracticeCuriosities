<template>
  <div>
    <table >
      <thead>
        <th>제품명</th>
        <th>가격</th>
        <th>남은 재고</th>
        <th>배송료</th>
      </thead>
      <tbody>
        <tr v-for="item in items" :key="item">
          <th>{{item.product}}</th>
          <th>{{item.price}}원</th>
          <th>{{item.stock}}개</th>
          <th>{{item.shipment}}원</th>
        </tr>
    </tbody>
    </table>
  </div>
</template>

<script>
export default {
  data() {
    const items = [
      { product: '제품1', price: 1000, stock: 1, shipment: 3000 },
      { product: '제품2', price: 2000, stock: 2, shipment: 2500 },
      { product: '제품3', price: 3000, stock: 3, shipment: 3000 },
      { product: '제품4', price: 4000, stock: 4, shipment: 2500 },
      { product: '제품5', price: 5000, stock: 5, shipment: 2500 },
  ]
    return {
      items
    }
  },
}
</script>
<style scoped>
  table {
    font-family: arial, sans-serif;
    border-collapse: collapse;
    width: 50%;
    text-align: center;
    margin:auto;
  }
  tr, th {
    border: 1px solid #000000;
    text-align: center;
    padding: 8px;
  }
</style>