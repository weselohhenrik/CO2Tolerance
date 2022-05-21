package com.example.co2tolerance.ui.screens

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.co2tolerance.ui.components.measurescreen.InstructionArea

@Composable
fun MeasureScreen(
    navController: NavController
) {
    MeasureScreen(
        onClickBack = {navController.popBackStack()},
        onClickStart = {}
    )
}

@Composable
fun MeasureScreen(
    onClickBack: () -> Unit,
    onClickStart: () -> Unit
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TopAppBar(
            title = {
                Text("Add new measurement")
            },
            navigationIcon = {
                IconButton(onClick = onClickBack) {
                    Icon(
                        Icons.Filled.ArrowBack,
                        contentDescription = ""
                    )
                }
            }
        )

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.5f),
            contentAlignment = Alignment.Center
        ) {
            InstructionArea()
        }

        var buttonEnabled = true // TODO: turn into state

        Box(
            modifier = Modifier
                .fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                ButtonStart(isRunning = false) {

                }

                Button(
                    onClick = onClickStart,
                    enabled = buttonEnabled,
                    modifier = Modifier.padding(top = 32.dp)
                ) {
                    Text("Save")
                }
            }

        }

    }
}

@Composable
fun ButtonStart(
    isRunning: Boolean,
    onClick: () -> Unit
) {
    Box(
        modifier = Modifier
            .clickable { onClick.invoke() }
            .clip(CircleShape)
            .size(160.dp)
            .border(width = 4.dp, color = Color.Green, shape = CircleShape),
        contentAlignment = Alignment.Center
    ) {
        var text: String
        if (isRunning) {
            text = "Stop"
        } else {
            text = "Start"
        }
        Text(
            text = text,
            fontSize = 36.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewButtonStart() {
    ButtonStart(
        false,
        {}
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewMeasureScreen() {
    MeasureScreen(
        {},
        {}
    )
}