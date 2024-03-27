<template>
  <div v-bind:title="tooltipMessage">마우스를 위에 올려보세요.</div>
</template>

<script>
export default {
  data() {
    return {
      tooltipMessage: '이것은 툴팁 메시지입니다.'
    }
  },
}
</script>