import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'

const routes = [
  {
    path: '/',
    name: 'home',
    component: HomeView
  },
  {
    path: '/about',
    name: 'about',
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () => import(/* webpackChunkName: "about" */ '../views/AboutView.vue')
  },
  {
    path: '/dataBindingTagText',
    name: 'dataBindingTagText',
    component: () => import(/* webpackChunkName: "about" */ '../views/DataBindingTagText.vue')
  },
  {
    path: '/dataBindingTagData',
    name: 'dataBindingTagData',
    component: () => import(/* webpackChunkName: "about" */ '../views/DataBindingTagData.vue')
  },
  {
    path: '/dataBindingValue',
    name: 'dataBindingValue',
    component: () => import(/* webpackChunkName: "about" */ '../views/DataBindingValue.vue')
  },
  {
    path: '/dataBindingMultiData',
    name: 'dataBindingMultiData',
    component: () => import(/* webpackChunkName: "about" */ '../views/DataBindingMultiData.vue')
  },
  {
    path: '/dataBindingButton',
    name: 'dataBindingButton',
    component: () => import(/* webpackChunkName: "about" */ '../views/DataBindingButton.vue')
  }
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
