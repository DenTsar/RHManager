package com.example.rhmanager.util

sealed class Screen(val route : String){
    object SplashScreen : Screen("splash_screen")
    object LoginScreen : Screen("login_screen")
    object StockScreen : Screen("stock_screen")

}
