package com.example.fittrack

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.fittrack.presentation.initial.InitialScreen
import com.example.fittrack.presentation.login.LoginScreen
import com.example.fittrack.presentation.login.Test
import com.google.firebase.auth.FirebaseAuth
import com.example.fittrack.presentation.singup.Register

@Composable
fun NavigationWrapper(navHostController: NavHostController, auth: FirebaseAuth) {

    NavHost(navController = navHostController, startDestination = "InitialScreen") {

        composable("InitialScreen") {
            InitialScreen(
                navigateToLogin = {
                    navHostController.navigate("LogIn") },
                navigateToSignUp = {navHostController.navigate("Register")}
            )
        }
        composable("LogIn") { Test(auth) }
        composable("Register"){ Register(auth)  }

    }
}

