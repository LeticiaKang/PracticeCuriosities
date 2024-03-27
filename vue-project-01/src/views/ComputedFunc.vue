<template>
  <h2>Full Name: {{ fullName }}</h2>
</template>

<script>
  export default {
    data() {
      return {
        firstName: 'firstName',
        lastName: 'lastName',
      };
    },
    computed: {
      fullName() {
        return `${this.firstName} ${this.lastName}`;
      }
    }
  }
</script>
