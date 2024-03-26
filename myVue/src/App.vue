<template>
  <h1>{{ message }}</h1>
</template>

<script>
import { onBeforeMount, onMounted, onBeforeUpdate, onUpdated } from 'vue'
export default {
  setup() {
    const message = "Hello Vue!"

    // 인스턴스가 마운트되기 전 단계
    onBeforeMount(() => {
      console.log("beforeMount\n");
    })
    
    // 인스턴스가 마운트된 후 단계
    onMounted(() => {
      console.log("mounted\n");
    })
    
    // 데이터가 변경되어 DOM에 적용되기 전 단계
    onBeforeUpdate(() => {
      console.log("beforeUpdate\n");
    })

    // 데이터가 변경되어 DOM에 적용된 후 단계
    onUpdated(() => {
      console.log("updated\n");
    })

    return {
      message,  
    }
  },
}
</script>