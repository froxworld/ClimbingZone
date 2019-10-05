<template>
    <div id="app">
        <img alt="Vue logo" src="./assets/logo.png">
        <Climber></Climber>
        <ClimberRoute></ClimberRoute>
      <HelloWorld></HelloWorld>
      <app5></app5>
    </div>
</template>

<script>
    import HelloWorld from './components/HelloWorld.vue'
    import Climber from "@/components/Climber";
    import ClimberRoute from "@/components/ClimberRoute";

    export default {
        name: 'app',
        components: {
            ClimberRoute, HelloWorld, Climber
        }
    }
</script>

<style>
    #app {
        font-family: 'Avenir', Helvetica, Arial, sans-serif;
        -webkit-font-smoothing: antialiased;
        -moz-osx-font-smoothing: grayscale;
        text-align: center;
        color: #2c3e50;
        margin-top: 60px;
    }
</style>
