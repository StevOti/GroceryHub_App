package com.example.groceryhub.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.groceryhub.ui.theme.pages.signup.SignupScreen
import com.example.groceryhub.ui.theme.pages.cart.CartScreen
import com.example.groceryhub.ui.theme.pages.home.HomeScreen
import com.example.groceryhub.ui.theme.pages.login.LoginScreen
import com.example.groceryhub.ui.theme.pages.products.AddProductsScreen
import com.example.groceryhub.ui.theme.pages.products.UpdateProductsScreen
import com.example.groceryhub.ui.theme.pages.profile.ProfileScreen
import com.example.groceryhub.ui.theme.pages.settings.SettingsScreen
import com.example.groceryhub.ui.theme.pages.shop.MarketScreen
import com.example.groceryhub.ui.theme.pages.shop.ShopScreen


@Composable
fun BottomNavGraph(navController: NavHostController) {

    NavHost(navController = navController,
        startDestination = BottomBarScreen.Home.route){

        composable(route = BottomBarScreen.Home.route){
            HomeScreen(navController)
        }
        composable(route = BottomBarScreen.Search.route){
           MarketScreen(navController)
        }
        composable(route = BottomBarScreen.Settings.route){
            SettingsScreen(navController)
        }
        composable(route = BottomBarScreen.Profile.route){
            ProfileScreen(navController)
        }
        composable(ROUTE_SHOP){
            ShopScreen(navController)
        }
        composable(ROUTE_SIGNUP){
            SignupScreen(navController)
        }
        composable(ROUTE_LOGIN){
            LoginScreen(navController)
        }

        composable(ROUTE_UPDATE_PRODUCTS + "/{id}"){passedData->
            UpdateProductsScreen(navController, passedData.arguments?.getString("id")!!)
        }

        composable(ROUTE_CART){
            CartScreen(navController)
        }

    }
}