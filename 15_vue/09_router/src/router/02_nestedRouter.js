import { createRouter, createWebHistory } from "vue-router";

import HomeView from "@/views/01_router/HomeView.vue";
import NestedHome from "@/views/02_nestedRouter/NestedHome.vue";
import RootRouter from "@/views/02_nestedRouter/RootRouter.vue";
import NestedView from "@/views/02_nestedRouter/NestedView.vue";

const router = createRouter({
    history: createWebHistory(),
    routes: [
        {
            path: '/',
            component: HomeView
        },
        {
            path: '/nasted',
            component: RootRouter,
        }
    ]
})

export default router;