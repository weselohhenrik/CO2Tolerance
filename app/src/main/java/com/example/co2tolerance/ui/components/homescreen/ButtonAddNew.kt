package com.example.co2tolerance.ui.components.homescreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ButtonAddNew(
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Box(modifier = modifier
        .size(160.dp)
        .clip(CircleShape)
        .border(
            width = 4.dp,
            color = Color.Green,
            shape = CircleShape
        )
        .clickable {
            onClick.invoke()
        }
    ) {
        /*Text(
            text = "Add new measurement",
            modifier = Modifier
                .align(Alignment.Center),
            fontSize = 20.sp,
            textAlign = TextAlign.Center
        ) */
        Icon(
            Icons.Filled.Add,
            contentDescription = "Make new Measurement",
            modifier = Modifier
                .align(Alignment.Center)
                .size(100.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewButtonAddNew() {
    ButtonAddNew(
        onClick = {}
    )
}