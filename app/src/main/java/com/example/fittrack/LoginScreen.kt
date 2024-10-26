package com.example.fittrack

import androidx.compose.foundation.background
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue


@Composable
@OptIn(ExperimentalMaterial3Api ::class)
fun LoginScreen(myNavController: NavController) {
    var email by remember { mutableStateOf(TextFieldValue("")) }
    var password by remember { mutableStateOf(TextFieldValue("")) }

    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color(0xFF282828))) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            // Título
            Text(
                text = "LogIn",
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFFFFFFFF),
                modifier = Modifier.padding(bottom = 24.dp)
            )

            // Campo de Email
            TextField(
                value = email,
                onValueChange = { email = it },
                label = { Text("Email") },
                leadingIcon = { Icon(
                    imageVector = Icons.Filled.Email, contentDescription = "Email Icon"
                ) },
                singleLine = true,
                keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.White, shape = RoundedCornerShape(8.dp)),
                colors = TextFieldDefaults.textFieldColors(
                    focusedIndicatorColor = Color(0xFF388E3C),
                    containerColor = Color.White
                )
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Campo de Contraseña
            TextField(
                value = password,
                onValueChange = {
                    password = it },
                label = {
                    Text("Password") },
                leadingIcon = {
                    Icon(imageVector = Icons.Filled.Lock, contentDescription = "PassWord Icon") },
                singleLine = true,
                visualTransformation = PasswordVisualTransformation(),
                keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Done),
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.White, shape = RoundedCornerShape(8.dp)),
                colors = TextFieldDefaults.textFieldColors(
                    focusedIndicatorColor = Color(0xFF388E3C),
                    containerColor = Color.White
                )
            )

            Spacer(modifier = Modifier.height(32.dp))

            // Botón de Log In
            Button(
                onClick = { myNavController.navigate("Dashboard") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFA0F03C)),
                shape = RoundedCornerShape(12.dp)
            ) {
                Text("Log In", color = Color(0xFFFFFFFF), fontSize = 18.sp, fontWeight = FontWeight.SemiBold)
            }

            Spacer(modifier = Modifier.height(8.dp))

            // Botón de Register
            Button(
                onClick = { myNavController.navigate("Register") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFA0F03C)),
                shape = RoundedCornerShape(12.dp)
            ) {
                Text("Register", color = Color(0xFFFFFFFF), fontSize = 18.sp, fontWeight = FontWeight.SemiBold)
            }
        }
    }
}
