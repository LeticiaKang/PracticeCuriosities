<template>
  <div>
    <input type="text" v-model="textValue" />
    <button type="button" v-bind:disabled="textValue==''">Click</button>
    <p>입력을 해야 버튼이 활성화된다.</p>
  </div>
  <br>
  <br>
  <div>
    <input v-model="newItem" placeholder="데이터 입력" />
    <button @click="addItem" v-bind:disabled="newItem==''">Click</button>
    <ul>
      <li v-for="(item, index) in items" :key="index">{{ item }}</li>
    </ul>
  </div>
</template>

<script>
export default {
  data() {
    return {
      textValue: "",
      newItem: '', // 사용자 입력을 위한 새 항목
      items: [] // 입력된 모든 데이터를 담는 배열
    }
  },
  methods: {
    addItem() {
      if (this.newItem !== '') {
        this.items.push(this.newItem); // 새 항목을 배열에 추가
        this.newItem = ''; // 입력 필드를 다시 비움
      }
    }
  }
}
</script>