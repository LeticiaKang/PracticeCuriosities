<template>
  <p> =================================================================== home template ============================================================= </p> <!-- 구분석 -->
  <div class="home">
    <img alt="Vue logo" src="../assets/logo.png">
    <p> ================================================================= HelloWorld template ========================================================== </p> <!-- 구분석 -->
    <HelloWorld msg="Welcome to Your Vue.js App"/>
  </div>
</template>

<script>
// @ is an alias to /src
import HelloWorld from '@/components/HelloWorld.vue'

export default {
  name: 'HomeView',
  components: {
    HelloWorld
  }
}
</script>
