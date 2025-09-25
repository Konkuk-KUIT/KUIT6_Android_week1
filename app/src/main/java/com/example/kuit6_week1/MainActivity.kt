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
import com.example.kuit6_week1.ui.theme.Kuit6_week1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Kuit6_week1Theme {
                Profile_Card()
//Sample()
            }
        }
    }
}
//comp
@Composable
fun Sample(modifier: Modifier = Modifier) {
    Column (
        modifier = Modifier.padding( top = 27.dp, bottom = 27.dp)
    ) {
        SampleRow {
            Box(
                modifier = modifier
                    .width(60.dp)
                    .height(60.dp)
                    .clip(RoundedCornerShape(20.dp))
                    .background(Color.Black)
            )
            Box(
                modifier = modifier
                    .width(60.dp)
                    .height(60.dp)
                    .clip(CircleShape)
                    .background(Color.Black)
            )
        }
        SampleRow(modifier = Modifier.padding(top = 20.dp)){
            Box(
                modifier = modifier
                    .size(60.dp)
                    .border(
                        color = Color.Black,
                        width = 2.dp,
                        shape = RoundedCornerShape(20.dp)
                    )

            )
            Box(
                modifier = modifier
                    .size(60.dp)
                    .border(
                        color = Color.Black,
                        width = 3.dp,
                        shape = CircleShape
                    )

            )
        }
        SampleRow (
            modifier = Modifier.padding(top = 20.dp)
        ) {
            Box(
                modifier = modifier
                    .size(76.dp)
                    .border(
                        width = 1.dp,
                        color = Color.Black
                    )
                    .padding(8.dp)
                    .background(Color.Red)
            )
            Box(
                modifier = modifier
                    .size(76.dp)
                    .border(
                        width = 1.dp,
                        color = Color.Black
                    )
                    .padding(8.dp)
                    .background(Color.Blue)
                    .clip(CircleShape)
            )
        }
        SampleRow (
            modifier = Modifier.padding(20.dp)
        ){
            Image(
                painter = painterResource( R.drawable.image),
                contentDescription = "개 이미지",
                modifier = Modifier.size(80.dp)
            )

            Image(
                painter = painterResource(R.drawable.image),
                contentDescription = "개 이미지",
                modifier = Modifier
                    .size(80.dp)
                    .clip(CircleShape)
            )

        }
        Text(
            modifier = Modifier
                .padding(top = 20.dp)
                .fillMaxWidth()
                .border(2.dp, color = Color.Black)
                .padding(10.dp),

            text = "Hello World!",
            fontSize = 20.sp,
            fontStyle = FontStyle.Normal,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            textAlign = TextAlign.Start
        )
    }
}

@Composable
fun Profile_Card(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.padding(top = 45.dp)
    ) {
        SampleRow{
            Box(
                modifier = modifier.size(240.dp,140.dp)
                    .fillMaxWidth()
                    .border(
                        color = Color.Black,
                        width = 1.dp,
                        shape = RoundedCornerShape(12.dp)
                    )
                    .padding(10.dp,)
            )
            {
                Image(
                    painter = painterResource(R.drawable.image2),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(start = 180.dp)
                        .size(40.dp,40.dp)
                )
                Box(
                    modifier = modifier.padding(top = 44.dp)
                ){
                    Box(
                        modifier = modifier
                            .width(220.dp)
                            .height(1.dp)
                            .clip(RoundedCornerShape(0.5.dp))
                            .background(Color.Black)
                    )
                    Text(
                        modifier = Modifier
                            .fillMaxWidth(),
                        text = "이름 : 안현지",
                        fontSize = 10.sp,
                        color = Color.Black,
                        textAlign = TextAlign.Start
                    )
                    Text(
                        modifier = Modifier
                            .padding(top = 19.dp)
                            .fillMaxWidth(),
                        text = "학번 : 202411315",
                        fontSize = 8.sp,
                        color = Color.Black,
                        textAlign = TextAlign.Start
                    )
                    Text(
                            modifier = Modifier
                                .padding(top = 34.dp)
                                .fillMaxWidth(),
                    text = "학과 : 컴퓨터공학부",
                    fontSize = 8.sp,
                    color = Color.Black,
                    textAlign = TextAlign.Start
                    )
                    Text(
                        modifier = Modifier
                            .padding(top = 49.dp)
                            .fillMaxWidth(),
                        text = "생년월일 : 2005/04/04",
                        fontSize = 8.sp,
                        color = Color.Black,
                        textAlign = TextAlign.Start
                    )
                }
//                Row(
//                    verticalAlignment = Alignment.CenterVertically
//
//                ) {
//
//                }

            }

        }

    }
}

@Preview(showBackground = true)
@Composable
fun TestPreview() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Yellow)
    ) {
        //Sample()
    }
}
