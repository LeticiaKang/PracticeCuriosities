<template>
  <div>
    <input type="text" v-model="textValue" />
    <button type="button" v-bind:disabled="textValue==''">Click</button>
    <p>입력을 해야 버튼이 활성화된다.</p>
  </div>
</template>

<script>
export default {
  data() {
    return {
      textValue: "",
    }
  },
}
</script>