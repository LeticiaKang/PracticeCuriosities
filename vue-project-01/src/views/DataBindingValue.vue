<template>
  <!-- 사용자로부터 데이터를 입력받을 수 있는 필드를 form element라고 한다.  -->
  <!-- 기본 타입은 text로 type="number"로 변경하여 숫자 값을 입력할 수 있다. 
        v-model.number="numberModel"로 데이터를 바인딩할 수 ㅇㅆ고, 이렇게 하면 나중에 프로그램 코드 내에서 사용자 입력한 값이 문자가 아닌 숫자로 관리된다. -->
  <input v-model="inputValue" />
  <br>
  <br>
  <textarea v-model="textareaValue" ></textarea>
  <br>
  <br>
  <select v-model="city">
    <option value="01">서울</option>
    <option value="021">부산</option>
    <option value="064">제주</option>
  </select>
  <br>
  <br>
  <input type="checkbox" v-model="checked" true-value="yes" false-value="no"> 체크박스 (yes/no)
  <br>
  <span>체크한 사항: {{ checked }}</span>
  <br>
  <br>
  <label><input type="checkbox" v-model="checkedCities" value="서울"> 서울 </label>
  <label><input type="checkbox" v-model="checkedCities" value="부산"> 부산 </label>
  <label><input type="checkbox" v-model="checkedCities" value="광주"> 광주 </label>  <!-- value값으로 인식한다. -->
  <br>
  <span>체크한 도시들: {{ checkedCities }}</span>
</template>

<script>
export default {
  data() {
    return {
      //초기 보여질 값
      inputValue: 'input 태그',
      textareaValue: 'textarea 태그',
      city: "064", 
      checked: "yes", // 체크가 되면 'yes', 해제되면 'no'
      checkedCities: [], // 체크된 도시들의 배열
    }
  },
}
</script>