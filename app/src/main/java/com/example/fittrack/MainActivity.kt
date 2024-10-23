package com.example.fittrack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            val myNavController = rememberNavController()

            NavHost(
                navController = myNavController,
                startDestination = "Login"
            ) {
                composable("Login") {
                    LoginScreen(myNavController)
                }

                composable("Register") {
                    RegisterScreen(myNavController)
                }

                composable("First") {
                    First(myNavController)
                }

                composable("AddRegister") {
                    AddRegister(myNavController)
                }
            }
        }
    }
}


