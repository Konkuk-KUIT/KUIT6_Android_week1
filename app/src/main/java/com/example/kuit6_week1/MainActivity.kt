package com.example.kuit6_week1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
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
                Sample()
            }
        }
    }
}

@Composable
fun Sample(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier.padding(top = 27.dp)
    ) {
        SampleRow {
            Box(
                modifier = modifier
                    .width(width = 60.dp)
                    .height(height = 60.dp)
                    .clip(shape = RoundedCornerShape(size = 20.dp))
                    .background(Color.Black)
            )

            Box(
                modifier = modifier
                    .width(width = 60.dp)
                    .height(height = 60.dp)
                    .clip(CircleShape)
                    .background(Color.Black)
            )
        }

        SampleRow(modifier = Modifier.padding(top = 20.dp)) {
            Box(
                modifier = Modifier
                    .size(size = 60.dp)
                    .border(
                        width = 2.dp,
                        color = Color.Black,
                        shape = RoundedCornerShape(size = 20.dp)
                    )
            )

            Box(
                modifier = Modifier
                    .size(size = 60.dp)
                    .border(
                        width = 3.dp,
                        color = Color.Black,
                        shape = CircleShape
                    )
            )
        }

        SampleRow (
            modifier = Modifier.padding(top = 20.dp)
        ) {
            Box(
                modifier = modifier
                    .size(size = 76.dp)
                    .border(
                        width = 1.dp,
                        color = Color.Black
                    )
                    .padding(all = 8.dp)
                    .background(Color.Red)
            )

            Box(
                modifier = modifier
                    .size(size = 76.dp)
                    .border(
                        width = 1.dp,
                        color = Color.Black
                    )
                    .padding(all = 8.dp)
                    .clip(CircleShape)
                    .background(Color.Blue)
            )
        }

        SampleRow(
            modifier = Modifier.padding(all = 20.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.image),
                contentDescription = "개 이미지",
                modifier = Modifier.size(size = 80.dp)
            )

            Image(
                painter = painterResource(id = R.drawable.image),
                contentDescription = "개 이미지",
                modifier = Modifier
                    .size(size = 80.dp)
                    .clip(CircleShape)
            )
        }

        SampleRow(
            modifier = Modifier.padding(all = 10.dp)
        ) {
            Column (
                modifier = modifier
                    .size(240.dp,140.dp)
                    .border(
                        1.dp,
                        color = Color.Black,
                        shape = RoundedCornerShape(size = 10.dp)
                    )
            ){
                Column(
                    modifier = Modifier.padding(16.dp),
                            verticalArrangement = Arrangement.spacedBy(3.dp)
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.End
                    ){
                        Box{
                            Image(
                                painter = painterResource(id = R.drawable.image2),
                                contentDescription = "쿠잇 이미지",
                                modifier = Modifier
                                    .size(size = 40.dp)
                                    .clip(RoundedCornerShape(size = 10.dp))
                            )
                        }
                    }

                    Column(
                        verticalArrangement = Arrangement.spacedBy(3.dp)
                    ) {
                        Divider(color = Color.Black, thickness = 0.5.dp)

                        Column(
                            verticalArrangement = Arrangement.spacedBy(1.dp)
                        ) {
                            Text("이름 : 이시헌", fontSize = 12.sp)
                            Text("학번 : 202411348", fontSize = 10.sp)
                            Text("학과 : 컴퓨터공학과", fontSize = 10.sp)
                            Text("생년월일 : 2004/10/11", fontSize = 10.sp)
                        }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun SamplePreview() {
    Box (
        modifier = Modifier.fillMaxSize()
    ){
        Sample()
    }
}