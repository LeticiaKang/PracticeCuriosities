<template>
  <p> =================================================================== Home template =========================================================== </p> <!-- 구분석 -->
  <nav>
    <router-link to="/">Home</router-link> |
    <p> =================================================================== About template =========================================================== </p> <!-- 구분석 -->
    <router-link to="/about">About</router-link>
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
