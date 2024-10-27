package com.example.fittrack

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ReadScreen(myNavController: NavController) {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF282828))
    ) {
        Scaffold(
            topBar = {
                TopAppBar(
                    title = { Text("Consultar Registros", color = Color.White) },
                    colors = TopAppBarDefaults.topAppBarColors(
                        containerColor = Color(0xFFBDBDC2)
                    )
                )
            },
            containerColor = Color.Transparent
        ) { innerPadding ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding)
                    .background(Color(0xFF282828)),
                contentAlignment = Alignment.Center
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Aquí se mostrarán los registros",
                        fontSize = 20.sp,
                        color = Color(0xFFFFFFFF)
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    Button(
                        onClick = { myNavController.navigate("AddRegister") },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xFFA0F03C)
                        )
                    ) {
                        Text("Añadir Nuevo Registro", color = Color.White)
                    }
                }
            }
        }
    }
}


