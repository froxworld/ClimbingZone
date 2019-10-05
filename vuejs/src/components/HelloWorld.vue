<template>
  <div class="hello">
    <h1>{{salut}}</h1>
  </div>
</template>



<script>
module.exports = {
 data: function () {
   return{
     salut: "hello world"
   }

 }
}
</script>




<!-- Add scoped comme ca le css n'est que pour ce fichier et pas pour les autres -->
<style scoped>
h3 {
  margin: 40px 0 0;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
