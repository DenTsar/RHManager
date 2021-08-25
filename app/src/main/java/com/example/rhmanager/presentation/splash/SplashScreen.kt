package com.example.rhmanager.presentation.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import com.example.rhmanager.R
import com.example.rhmanager.util.Screen
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(
    navController: NavController
) {
    LaunchedEffect(key1 = true, block = {
        delay(3000)
        navController.popBackStack()
        navController.navigate(Screen.LoginScreen.route)
    })
     Box(
         modifier = Modifier.fillMaxSize(),
         contentAlignment = Alignment.Center,
     ){
         Image(
             painter = painterResource(id = R.drawable.temp_logo),
             contentDescription = "Logo",
         )
     }
}