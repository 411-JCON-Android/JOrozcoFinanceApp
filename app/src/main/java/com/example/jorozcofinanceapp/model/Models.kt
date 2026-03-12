package com.example.jorozcofinanceapp.model

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector

// 1.
data class User(
    val name: String,
    val balance: Double
)

// 2.
data class SummaryCard(
    val title: String,
    val amount: Double,
    val backgroundColor: Color
)

// 3.
data class Transaction(
    val establishmentName: String,
    val category: String,
    val amount: Double,
    val time: String,
    val icon: ImageVector
)