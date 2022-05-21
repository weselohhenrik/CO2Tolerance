package com.example.co2tolerance.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.co2tolerance.Recovery
import com.example.co2tolerance.getRecoveryColor
import com.example.co2tolerance.getRecoveryMessage
import com.example.co2tolerance.ui.components.homescreen.ButtonAddNew
import com.example.co2tolerance.ui.components.homescreen.ListItem
import com.example.co2tolerance.ui.components.homescreen.TodayItem


@Composable
fun HomeScreen() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TopAppBar(
            title = {
                Text("CO2Tolerance")
            }
        )

        ButtonAddNew(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .padding(top = 32.dp, bottom = 32.dp)
        )

        Column(
            modifier = Modifier
                .fillMaxWidth(0.8f)
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            TodayItem(
                status = Recovery.LOW,
                numSeconds = 40,
                date = "1.1.1970"
            )

            repeat(10) {
                ListItem(numSeconds = 40, date = "1.1.1970", status = Recovery.LOW)
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewHomeScreen() {
    HomeScreen()
}