package com.example.rhmanager.presentation.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import com.example.rhmanager.R

@Composable
fun SplashScreen(
    navController: NavController
) {
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