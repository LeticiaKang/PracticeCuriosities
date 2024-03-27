<template>
  <p> =================================================================== Home template =========================================================== </p> <!-- 구분석 -->
  <nav>
    <router-link to="/">Home</router-link> |
    <!-- <p> =================================================================== About template =========================================================== </p> 구분석 -->
    <router-link to="/about">About</router-link> 
    <hr>
    <router-link to="/dataBindingTagText">HTML 태그 내 텍스트로 데이터 바인딩</router-link> | 
    <router-link to="/dataBindingTagData">HTML 태그 속성으로 데이터 바인딩</router-link> | 
    <router-link to="/dataBindingValue">HTML 폼 요소의 value에 데이터 바인딩</router-link> | 
    <router-link to="/dataBindingMultiData">다중 데이터를 이용한 HTML 요소 생성</router-link>
    <hr>
    <router-link to="/listRendering">V-for Rendering</router-link> 
    <hr>
    <router-link to="/dataBindingButton">button disabled</router-link>
    <hr>
    <router-link to="/clickEvent"> 클릭 이벤트 </router-link>
    <hr>
  </nav>
  <router-view/>  <!-- 라우팅 컴포넌트, 현재 라우트에 맞는 컴포넌트를 동적으로 표시한다.
                        Home이나 About 메뉴를 클릭하면 해당하는 하위 템플릿(컴포넌트)가 <router-view/> 태그가 있는 영역에 표시되는 것-->
</template>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

nav {
  padding: 30px;
}

nav a {
  font-weight: bold;
  color: #2c3e50;
}

nav a.router-link-exact-active {
  color: #42b983;
}
</style>
