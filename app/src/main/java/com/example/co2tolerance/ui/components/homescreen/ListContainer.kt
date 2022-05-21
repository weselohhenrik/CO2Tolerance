package com.example.co2tolerance.ui.components.homescreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.co2tolerance.Recovery

@Composable
fun ListContainer(
    content: @Composable () -> Unit
) {
    Surface(
        shape = RoundedCornerShape(8.dp),
        color = Color(0xaafafafa), // TODO: update color
        elevation = 8.dp
    ) {
        Column(
            modifier = Modifier
                .background(Color(0xaafafafa)) // TODO: update color
                .padding(top = 8.dp, start = 16.dp, end = 16.dp)
                .verticalScroll(rememberScrollState()),
        ) {
            content.invoke()
        }
    }
}

@Preview
@Composable
fun PreviewListContainer() {
    ListContainer {
        repeat(10) {
            ListItem(numSeconds = 40, date = "1.1.1970", status = Recovery.HIGH)
        }
    }
}