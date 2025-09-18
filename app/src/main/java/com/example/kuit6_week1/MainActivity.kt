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
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
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
        SampleRow(modifier = Modifier.padding(top = 27.dp)) {
            Box(
                modifier = modifier
                    .size(size = 60.dp)
                    .border(
                        width = 2.dp,
                        color = Color.Black,
                        shape = RoundedCornerShape(size = 20.dp)
                    )
            )
            Box(
                modifier = modifier
                    .size(size = 60.dp)
                    .border(
                        width = 3.dp,
                        color = Color.Black,
                        shape = CircleShape
                    )
            )
        }
        SampleRow(
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
            modifier = Modifier.padding(top = 20.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.image),
                contentDescription ="개 이미지",
                modifier = Modifier.size(80.dp)
                )
            Image(
                painter = painterResource(R.drawable.image),
                contentDescription ="개 이미지",
                modifier = Modifier
                    .size(80.dp)
                    .clip(CircleShape)
            )
        }

        Text(
            modifier = Modifier
                .padding(top = 20.dp)
                .fillMaxWidth()
                .border(width = 2.dp, color = Color.Black)
                .padding(all = 10.dp),

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
fun ModifierOrderExample() {
    Box(
        modifier = Modifier
            .size(100.dp)
            .background(Color.Red)
            .padding(16.dp)
    )
}

@Composable
fun ModifierOrderExample2() {
    Box(
        modifier = Modifier
            .size(100.dp)
            .padding(16.dp)
            .background(Color.Red)
    )
}


@Composable
fun ProfileCard(
) {
    Box(
        modifier = Modifier
            .size(490.dp, 255.dp)
            .padding(top=45.dp, start=45.dp)
    ){
        Box(
            modifier = Modifier
                .size(width = 240.dp, height = 140.dp)
                .border(1.dp, Color.Black, RoundedCornerShape(10.dp))
        ){
            Image(
                painter = painterResource(R.drawable.kuit),
                contentDescription ="쿠잇 로고",
                modifier = Modifier
                    .align(Alignment.TopEnd)
                    .offset(x = (-10).dp, y = 10.dp)
                    .size(40.dp)
                    .clip(shape = RoundedCornerShape(size = 10.dp)),
                contentScale = ContentScale.Fit  // 원본 비율 유지

            )
            Box(
                modifier = Modifier
                    .fillMaxWidth(),
                contentAlignment = Alignment.Center
            ){
            HorizontalDivider(
                modifier = Modifier
                    .padding(top = 56.dp)
                    .width(220.dp),
                    thickness = 0.5.dp,
                    color =Color.Black
            )
            }
            Column (
                modifier= Modifier
                    .fillMaxWidth()
                    .padding(start = 10.dp, top = 64.dp),
                    verticalArrangement = Arrangement.spacedBy(5.dp)
            ){
                val inter = FontFamily(
                Font(R.font.inter)
            )

                Text(
                    text = "이름 : 박경민",
                    fontFamily = inter,
                    fontSize = 10.sp
                )
                Text(
                    text = "학번 : 202412357",
                    fontFamily = inter,
                    fontSize = 8.sp,
                    modifier = Modifier.padding(top = 4.dp)
                )
                Text(
                    text = "학과 : 컴퓨터공학부",
                    fontFamily = inter,
                    fontSize = 8.sp
                )
                Text(
                    text = "생년월일 : 2004/08/02",
                    fontFamily = inter,
                    fontSize = 8.sp
                )

            }

        }
    }
}

/*
@Preview(showBackground = true)
@Composable
private fun SamplePreview() {
    Box(
        modifier = Modifier.fillMaxSize()
    ){
        Sample()
    }
}

@Preview(showBackground = true)
@Composable
private fun ModifierOrderExamplePreview1() {
    ModifierOrderExample()
}

@Preview(showBackground = true)
@Composable
private fun ModifierOrderExamplePreview2() {
    ModifierOrderExample2()
}
*/
@Preview(showBackground = true)
@Composable
private fun ProfileCardPreview(){
    ProfileCard()
}
