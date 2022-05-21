package com.example.co2tolerance

import androidx.compose.ui.graphics.Color

enum class Recovery {
    LOW,
    MEDIUM,
    HIGH
}

fun getRecoveryColor(recovery: Recovery): Color {
    return when (recovery) {
        Recovery.LOW -> Color.Red // TODO: update color
        Recovery.MEDIUM -> Color.Yellow // TODO: update color
        Recovery.HIGH -> Color.Green // TODO: update color
    }
}

fun getRecoveryMessage(recovery: Recovery): String {
    return when (recovery) {
        Recovery.LOW -> "You are not recovered"
        Recovery.MEDIUM -> "You are almost recovered"
        Recovery.HIGH -> "You are very well recovered"
    }
}