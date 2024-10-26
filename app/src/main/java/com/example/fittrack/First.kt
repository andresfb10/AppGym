package com.example.fittrack

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun First(myNavController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF282828))
    ) {
        Scaffold(
            topBar = {
                TopAppBar(
                    title = { Text("Menú", color = Color(0xFFFFFFFF)) },
                    colors = TopAppBarDefaults.smallTopAppBarColors(
                        containerColor = Color(0xFFBDBDC2)
                    )
                )
            },
            containerColor = Color.Transparent
        ) { innerPadding ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding)
                    .padding(24.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Bienvenido al Menú",
                    fontSize = 24.sp,
                    color = Color(0xFFFFFFFF),
                    modifier = Modifier.padding(bottom = 24.dp)
                )

                Button(
                    onClick = { myNavController.navigate("AddRegister") },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 8.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFA0F03C)),
                    shape = RoundedCornerShape(12.dp)
                ) {
                    Text("Añadir Registro", color = Color.White, fontSize = 18.sp)
                }

                Spacer(modifier = Modifier.height(16.dp))

                Button(
                    onClick = { myNavController.navigate("Read") },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 8.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFA0F03C)),
                    shape = RoundedCornerShape(12.dp)
                ) {
                    Text("Consultar", color = Color.White, fontSize = 18.sp)
                }

                Spacer(modifier = Modifier.weight(1f))

                Button(
                    onClick = { myNavController.navigate("Login") },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 16.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFA0F03C)),
                    shape = RoundedCornerShape(12.dp)
                ) {
                    Text("Cerrar Sesión", color = Color.White, fontSize = 18.sp)
                }
            }
        }
    }
}





