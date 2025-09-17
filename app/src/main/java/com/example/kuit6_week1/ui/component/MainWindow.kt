package com.example.kuit6_week1.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.kuit6_week1.R

@Composable
fun MainWindow(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.padding(top = 27.dp)
    ) {
        SampleRow {
            Box(
                modifier = Modifier
                    .width(60.dp)
                    .height(60.dp)
                    .clip(RoundedCornerShape(20.dp))
                    .background(Color.Black)
            )

            Box(
                modifier = Modifier
                    .size(60.dp)
                    .clip(CircleShape)
                    .background(Color.Black)
            )
        }

        SampleRow(modifier = Modifier.padding(top = 20.dp)) {

            Box(
                modifier = Modifier
                    .width(60.dp)
                    .height(60.dp)
                    .border(
                        width = 2.dp,
                        color = Color.Black,
                        shape = RoundedCornerShape(20.dp)
                    )
            )

            Box(
                modifier = Modifier
                    .size(60.dp)
                    .border(
                        width = 3.dp,
                        color = Color.Black,
                        shape = CircleShape
                    )
            )

        }

        SampleRow(modifier = Modifier.padding(top = 20.dp)) {

            Box(
                modifier = Modifier
                    .width(76.dp)
                    .height(76.dp)
                    .border(
                        width = 1.dp,
                        color = Color.Black
                    )
                    .padding(8.dp)
                    .background(Color.Red)
            )

            Box(
                modifier = Modifier
                    .width(76.dp)
                    .height(76.dp)
                    .border(
                        width = 1.dp,
                        color = Color.Black
                    )
                    .padding(8.dp)
                    .clip(CircleShape)
                    .background(Color.Blue)
            )
        }

        SampleRow(modifier = Modifier.padding(top = 20.dp)) {
            Box(
                modifier = Modifier
                    .width(80.dp)
                    .height(80.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.dog),
                    contentDescription = "dog",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()
                )
            }

            Box(
                modifier = Modifier.size(80.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.dog),
                    contentDescription = "dog",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxSize()
                        .clip(CircleShape)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainWindowPreview() {
    Box(modifier = Modifier.fillMaxSize()) {
        MainWindow()
    }
}