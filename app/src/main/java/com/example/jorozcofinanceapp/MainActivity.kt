package com.example.jorozcofinanceapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.jorozcofinanceapp.components.HomeHeader
import com.example.jorozcofinanceapp.model.User
import com.example.jorozcofinanceapp.ui.theme.JOrozcoFinanceAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JOrozcoFinanceAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    // Crear usuario
                    val currentUser = User(name = "Juan", balance = 0.0)

                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding)
                            .background(Color(0xFFFAFAFA))
                    ) {
                        // Llamar secciones
                        HomeHeader(user = currentUser)


                    }
                }
            }
        }
    }
}
