<!-- 스크립트 코드 작성 -->
<script setup>
// Props에 유효성 검사를 지정 - 설명 Docs : https://ko.vuejs.org/guide/components/props
defineProps({
  // 문자열 필수 검사
  msg: {
    type: String,
    required: true
  }
})
</script>

<!-- HTML 코드 작성 -->
<template>
  <div class="greetings">
    <h1 class="green">{{ msg }}</h1>
    <h3>
      You’ve successfully created a project with
      <a href="https://vitejs.dev/" target="_blank" rel="noopener">Vite</a> +
      <a href="https://vuejs.org/" target="_blank" rel="noopener">Vue 3</a> + 
      <a href="https://vuejs.org/" target="_blank" rel="noopener">Vue 3</a>.
    </h3>
  </div>
</template>

<!-- CSS 코드 작성 -->
<style scoped>
h1 {
  font-weight: 500;
  font-size: 2.6rem;
  top: -10px;
}

h3 {
  font-size: 1.2rem;
}

.greetings h1,
.greetings h3 {
  text-align: center;
}

@media (min-width: 1024px) {
  .greetings h1,
  .greetings h3 {
    text-align: left;
  }
}
</style>
