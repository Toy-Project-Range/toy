import Vue from "vue";
import VueRouter from "vue-router";
import HomeView from "../views/HomeView.vue";
import LoginView from "../views/LoginView.vue";
import AlgorithmView from "../views/AlgorithmView.vue";

Vue.use(VueRouter);

const routes = [
  {
    path: "/",
    name: "login",
    component: LoginView,
  },
  {
    path: "/main",
    name: "home",
    component: HomeView,
  },
  {
    path: "/algorithm",
    name: "algorithm",
    component: AlgorithmView,
  },
];

const router = new VueRouter({
  mode: "history",
  base: process.env.BASE_URL,
  routes,
});

export default router;
