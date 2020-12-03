<template>
  <div class="deatils">
    {{ book.title }}
    {{ book.author }}
  </div>
</template>

<script>
export default {
  props: {
    book: Object,
  },
};
</script>