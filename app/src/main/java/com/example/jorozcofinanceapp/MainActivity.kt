package com.example.jorozcofinanceapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
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
import com.example.jorozcofinanceapp.components.SummaryCardsSection
import com.example.jorozcofinanceapp.model.SummaryCard
import com.example.jorozcofinanceapp.model.User
import com.example.jorozcofinanceapp.ui.theme.CardActivityBg
import com.example.jorozcofinanceapp.ui.theme.CardProfitsBg
import com.example.jorozcofinanceapp.ui.theme.CardSalesBg
import com.example.jorozcofinanceapp.ui.theme.JOrozcoFinanceAppTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.material.icons.rounded.Place
import androidx.compose.material.icons.rounded.ThumbUp
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Info
import androidx.compose.material.icons.rounded.Star
import com.example.jorozcofinanceapp.model.Transaction
import com.example.jorozcofinanceapp.components.TransactionListSection

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JOrozcoFinanceAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    // Crear cosas
                    val currentUser = User(name = "Juan", balance = 0.0)
                    val summaryCards = listOf(
                        SummaryCard("Actividad", 430.18, CardActivityBg), // no estoy muy seguro de si poner un número pq no viene en la foto, pero la clase lo usa así que lo dejo en 0
                        SummaryCard("Ventas", 320.43, CardSalesBg),
                        SummaryCard("Ganancias", 146.59, CardProfitsBg)
                    )
                    val transactionsList = listOf(
                        Transaction("Supermarket", "Groceries", 45.99, "10:30 AM", Icons.Rounded.ShoppingCart),
                        Transaction("Gas Station", "Fuel", -30.50, "12:15 PM", Icons.Rounded.Place),
                        Transaction("Coffee Shop", "Food & Drinks", 5.75, "8:00 AM", Icons.Rounded.ThumbUp),
                        Transaction("Electronics Store", "Electronics", 120.00, "3:45 PM", Icons.Rounded.Phone),
                        Transaction("Bookstore", "Books", 25.99, "2:00 PM", Icons.Rounded.Info),
                        Transaction("Restaurant", "Dining", 60.00, "7:30 PM", Icons.Rounded.Star),
                        Transaction("Online Subscription", "Entertainment", 12.99, "10:00 AM", Icons.Rounded.Phone),
                        Transaction("Pharmacy", "Health", 15.50, "4:20 PM", Icons.Rounded.ShoppingCart)
                    )

                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding)
                            .background(Color(0xFFFAFAFA))
                    ) {
                        // Llamar secciones
                        HomeHeader(user = currentUser)
                        SummaryCardsSection(cards = summaryCards)
                        Box(modifier = Modifier.weight(1f)) {
                            TransactionListSection(transactions = transactionsList)
                        }

                    }
                }
            }
        }
    }
}
