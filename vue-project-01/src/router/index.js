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
  createDataBindingRoute('TagText', 'TagText'),
  createDataBindingRoute('TagData', 'TagData'),
  createDataBindingRoute('Value', 'Value'),
  createDataBindingRoute('MultiData', 'MultiData'),
  createDataBindingRoute('Button', 'Button'),
  {
    path: '/listRendering',
    name: 'listRendering',
    component: () => import('../views/ListRendering.vue'),
  },
  {
    path: '/clickEvent',
    name: 'clickEvent',
    component: () => import('../views/EventClick.vue')
  },
  {
    path: '/watchFunc',
    name: 'watchFunc',
    component: () => import('../views/WatchFunc.vue')
  },
  {
    path: '/computedFunc',
    name: 'computedFunc',
    component: () => import('../views/ComputedFunc.vue')
  },
  {
    path: '/nested',
    name: 'nested',
    component: () => import('../views/NestedComponent.vue')
  },
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router

function createDataBindingRoute(path, name) {
  return {
    path: `/dataBinding${path}`,
    name: `dataBinding${name}`,
    component: () => import(`../views/databing/DataBinding${name}.vue`)
  };
}