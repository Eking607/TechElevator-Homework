<template>
  <div>
    <reading-list />
    <a href="/addBook"> Add Book To Reading List</a>
  </div>
</template>

<script>
import ReadingList from "@/components/ReadingList.vue";
export default {
  components: {
    ReadingList,
  },
};
</script>
    ReadingList