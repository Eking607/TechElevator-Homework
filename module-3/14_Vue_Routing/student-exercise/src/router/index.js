import Vue from 'vue';
import VueRouter from 'vue-router';
import Home from '@/views/Home';
import Books from '@/views/Books';
import AddBook from '@/views/AddBook';
import Details from '@/views/Details';

Vue.use(VueRouter);

const routes = [
  {
    path: '/',
    name: 'Home',
    component: Home,
  },
  {
    path: '/myBooks',
    name: 'Books',
    component: Books,
  },

  {
    path: '/addBook',
    name: 'AddBook',
    component: AddBook
  },
  {
    path: '/book/:isbn',
    name: 'Details',
    component: Details
  }



];

const router = new VueRouter({
  mode: 'history',
  routes
});

export default router;
