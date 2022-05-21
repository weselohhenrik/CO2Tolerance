package com.example.co2tolerance.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.co2tolerance.Recovery
import com.example.co2tolerance.ui.components.homescreen.ButtonAddNew
import com.example.co2tolerance.ui.components.homescreen.ListContainer
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
                .fillMaxWidth(0.8f),

            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            TodayItem(
                status = Recovery.LOW,
                numSeconds = 40,
                date = "1.1.1970"
            )

            Spacer(modifier = Modifier.height(20.dp))

            ListContainer {
                repeat(10) {
                    ListItem(numSeconds = 40, date = "1.1.1970", status = Recovery.LOW)
                }
            }

        }
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewHomeScreen() {
    HomeScreen()
}