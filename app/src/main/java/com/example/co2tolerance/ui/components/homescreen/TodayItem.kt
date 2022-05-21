package com.example.co2tolerance.ui.components.homescreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.co2tolerance.Recovery
import com.example.co2tolerance.getRecoveryColor
import com.example.co2tolerance.getRecoveryMessage


@Composable
fun TodayItem(
    status: Recovery,
    numSeconds: Int,
    date: String,
    modifier: Modifier = Modifier
) {
    val background = getRecoveryColor(status)

    Column {
        Text(
            text = "Today",
            fontSize = 24.sp,
            //fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(start = 8.dp, bottom = 4.dp)
        )

            Surface(
                shape = RoundedCornerShape(8.dp),
                color = background,
                elevation = 8.dp
            ) {
                Row {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .fillMaxWidth()
                    ) {
                        Text(
                            text = getRecoveryMessage(status),
                            fontSize = 24.sp,
                            textAlign = TextAlign.Center,
                            modifier = Modifier
                                .padding(top = 8.dp)
                        )

                        Row(
                            modifier = Modifier
                                .padding(vertical = 8.dp)
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
                }
            }

    }
}

@Preview(showBackground = true)
@Composable
fun PreviewTodayItem() {
    TodayItem(status = Recovery.HIGH, numSeconds = 40, "1.1.1970")
}