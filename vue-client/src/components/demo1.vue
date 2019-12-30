<template>

  <ol>
    <!-- 创建一个 todo-item 组件的实例 -->
    <todo-item
      v-for="item in groceryList"
      v-bind:todo="item"
      v-bind:key="item.id"
    ></todo-item>
  </ol>

</template>

<script>

  import TodoItem from './comp1.vue'

  export default {
    el: '#example',
    data(){
      return{
        groceryList: [
          { id: 0, text: '蔬菜' },
          { id: 1, text: '奶酪' },
          { id: 2, text: '随便其它什么人吃的东西' }
        ]
      }
    },
    components:{TodoItem}
  }

</script>

<style scoped>

</style>
