package com.example.co2tolerance.ui.components.homescreen

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.co2tolerance.Recovery
import com.example.co2tolerance.getRecoveryColor


@Composable
fun ListItem(
    numSeconds: Int,
    date: String,
    status: Recovery,
    modifier: Modifier = Modifier
) {
    val background = getRecoveryColor(status)


    Row(
        modifier = modifier
            .padding(vertical = 8.dp)
            .clip(RoundedCornerShape(8.dp))
            .border(4.dp, shape = RoundedCornerShape(8.dp), color = background)
            .padding(vertical = 16.dp)
            .fillMaxWidth()
    ) {
        Text(
            text = "$numSeconds seconds",
            modifier = Modifier
                .padding(start = 16.dp),
            fontSize = 20.sp
        )
        Text(
            text = date,
            fontSize = 20.sp,
            modifier = Modifier
                .padding(start = 32.dp)
        )
    }

}

@Preview(showBackground = true)
@Composable
fun PreviewListItem() {
    ListItem(
        numSeconds = 40,
        date = "1.1.1970",
        status = Recovery.MEDIUM
    )
}