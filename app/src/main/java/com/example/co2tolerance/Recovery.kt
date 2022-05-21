package com.example.co2tolerance

import androidx.compose.ui.graphics.Color

enum class Recovery {
    LOW,
    MEDIUM,
    HIGH
}

fun getRecoveryColor(recovery: Recovery): Color {
    return when (recovery) {
        Recovery.LOW -> Color.Red
        Recovery.MEDIUM -> Color.Yellow
        Recovery.HIGH -> Color.Green
    }
}

fun getRecoveryMessage(recovery: Recovery): String {
    return when (recovery) {
        Recovery.LOW -> "You are not recovered"
        Recovery.MEDIUM -> "You are almost recovered"
        Recovery.HIGH -> "You are very well recovered"
    }
}