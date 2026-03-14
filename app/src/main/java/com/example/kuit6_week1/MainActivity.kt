package com.example.kuit6_week1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kuit6_week1.ui.ProfileCard2
import com.example.kuit6_week1.ui.theme.Kuit6_week1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Kuit6_week1Theme {
                ProfileCard2()
            }
        }
    }
}

@Composable
fun Sample(modifier: Modifier = Modifier) {
    Column(Modifier.padding(top = 27.dp)) {
        SampleRow {
            Box(
                modifier
                    .width(60.dp)
                    .height(60.dp)
                    .clip(shape = RoundedCornerShape(20.dp))
                    .background(color = Color.Black)
            )
            Box(
                modifier
                    .width(60.dp)
                    .height(60.dp)
                    .clip(shape = CircleShape)
                    .background(color = Color.Black)
            )

        }
        SampleRow(Modifier.padding(top = 20.dp)) {
            Box(
                modifier
                    .size(60.dp)
                    .clip(shape = RoundedCornerShape(20.dp))
                    .border(
                        width = 2.dp,
                        color = Color.Black,
                        shape = RoundedCornerShape(20.dp)
                    )
            )
            Box(
                modifier
                    .size(60.dp)
                    .clip(shape = RoundedCornerShape(20.dp))
                    .border(
                        width = 3.dp,
                        color = Color.Black,
                        shape = CircleShape
                    )
            )
        }
        SampleRow(Modifier.padding(top = 20.dp)) {
            Box(
                modifier
                    .size(76.dp)
                    .border(
                        1.dp,
                        color = Color.Black
                    )
                    .padding(8.dp)
                    .background(Color.Red)
            )
            Box(
                modifier
                    .size(76.dp)
                    .border(
                        1.dp,
                        color = Color.Black
                    )
                    .padding(8.dp)
                    .clip(CircleShape)
                    .background(Color.Blue)
            )
        }

        SampleRow(Modifier.padding(top = 20.dp)) {
            Image(
                painter = painterResource(R.drawable.image),
                contentDescription = "개 이미지",
                modifier = modifier.size(80.dp)
            )
            Image(
                painter = painterResource(R.drawable.image),
                contentDescription = "개 이미지",
                modifier = modifier
                    .size(80.dp)
                    .clip(CircleShape)
            )
        }

        Text(
            "Hello World!",
            modifier = Modifier
                .padding(top = 20.dp)
                .fillMaxWidth()
                .border(width = 2.dp, color = Color.Black)
                .padding(10.dp),
            fontSize = 20.sp,
            fontStyle = FontStyle.Normal,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            textAlign = TextAlign.Start
        )
    }
}

@Preview
@Composable
private fun SamplePreview() {
    Box(Modifier.fillMaxSize()) {
        Sample()
    }
}