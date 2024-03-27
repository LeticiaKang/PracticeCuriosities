<template>
  <ul>
    <li v-for="item in items" :key="item">{{ item }}</li>
  </ul>
</template>

<script>
export default {
  data() {
    return {
      items: ['사과', '바나나', '체리']
    }
  }
}
</script>