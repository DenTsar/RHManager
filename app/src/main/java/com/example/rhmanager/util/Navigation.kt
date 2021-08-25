package com.example.rhmanager.util

import androidx.compose.runtime.Composable
import androidx.navigation.compose.*
import com.example.rhmanager.presentation.splash.SplashScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.SplashScreen.route){
        composable(Screen.SplashScreen.route){
            SplashScreen(navController = navController)
        }
        composable(Screen.LoginScreen.route){

        }
    }
}