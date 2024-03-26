<!--
      Single File Component 는 Vue 컴포넌트를 하나의 파일로 작성하는 기능이다.
      <template>, <script>, <style> 세 블록으로 구성된 HTML 기반 문법으로 정의하고, 
      최종적으로 vue 확장자를 갖는 파일로 작성된다.

      App은 최상위 컴포넌트이고, SFC 형식을 지니고 있다.
-->
<!-- 스크립트 코드 작성 -->
<script setup>
// 컴포넌트를 import하여 사용함
import HelloWorld from './components/HelloWorld.vue'
import TheWelcome from './components/TheWelcome.vue'
</script>

<!-- HTML 코드 작성 -->
<template>
  <header>
    <img alt="Vue logo" class="logo" src="@/assets/logo.svg" width="125" height="125" />

    <div class="wrapper">
      <!-- HelloWorld 컴포넌트 -->
      <!-- Props 속성을 이용하여 상위 컴포넌트에서 하위 컴포넌트로 데이터를 전달한다. -->
      <HelloWorld msg="Props 속성을 이용한 Data 전달" />
    </div>
  </header>

  <main>
    <!-- TheWelcome 컴포넌트 -->
    <TheWelcome/>
  </main>>
</template>

<!-- CSS 코드 작성 -->
<style scoped>
header {
  line-height: 1.5;
}

.logo {
  display: block;
  margin: 0 auto 2rem;
}

@media (min-width: 1024px) {
  header {
    display: flex;
    place-items: center;
    padding-right: calc(var(--section-gap) / 2);
  }

  .logo {
    margin: 0 2rem 0 0;
  }

  header .wrapper {
    display: flex;
    place-items: flex-start;
    flex-wrap: wrap;
  }
}
</style>
