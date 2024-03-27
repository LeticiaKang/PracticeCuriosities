<template>
  <main>
    <h2> Full Name : {{ fullName }} </h2>
    <br>
    <button type="button" @click="changeName">변경</button>
  </main>
</template>

<script>
  export default {
    data() {
      return {
        firstName: 'fistName',
        lastName: 'lastName',
        fullName: '',
      };
    },
    watch: {
      firstName() {
        this.fullName = this.firstName + ' ' + this.lastName;
      },
      lastName() {
        this.fullName = this.firstName + ' ' + this.lastName;
      }
    },
    methods: {
      changeName() {
        this.firstName = 'Eunsol';
      }
    }
  }
</script>