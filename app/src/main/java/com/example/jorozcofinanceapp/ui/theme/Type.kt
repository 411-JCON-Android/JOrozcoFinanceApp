package com.example.jorozcofinanceapp.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.jorozcofinanceapp.R

val interFontFamily = FontFamily(
    Font(R.font.inter_regular, FontWeight.Normal),
    Font(R.font.inter_medium, FontWeight.Medium),
    Font(R.font.inter_bold, FontWeight.Bold)
)

val Typography = Typography(
    // títulos grandes
    headlineMedium = TextStyle(
        fontFamily = interFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp,
        color = TextPrimary
    ),
    // textos normales (cuerpo)
    bodyLarge = TextStyle(
        fontFamily = interFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        color = TextPrimary
    ),
    // subtítulos y textos pequeños
    bodyMedium = TextStyle(
        fontFamily = interFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        color = TextSecondary
    )
)