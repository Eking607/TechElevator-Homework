<template>
  <div>
    <book-details v-bind:book="isbnNumber" />
  </div>
</template>

<script>
import BookDetails from "@/components/BookDetails.vue";
export default {
  components: {
    BookDetails,
  },
  computed: {
    isbnNumber() {
      return this.$store.state.books.find(
        (book) => book.isbn === this.$route.params.isbn
      );
    },
  },
};
</script>
    BookDetails