<template>
  <main>
    <p> - 누르면 1씩 올라가는 버튼</p>
    <button type="button" @click="plusOne() "> + 1 </button> &nbsp;
    <button type="button" @click="resetZero() "> reset 0 </button> &nbsp;
    count 값 변화 : {{ count }}
    <br>
    <p> - 2개의 method 적용</p>
    <button type="button" @click="one(), two() "> 버튼 </button> &nbsp;
  </main>
</template>

<script>
export default {
  data() {
    return {
      count: 0,
    }
  },
  methods: {
    plusOne(){
      this.count = this.count + 1;
    },
    resetZero(){
      this.count = 0;
    },
    one(){
      alert("one")
    },
    two(){
      alert("two")
    }
  }
}
</script>