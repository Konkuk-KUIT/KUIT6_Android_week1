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
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
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
                Sample()
            }
        }
    }
}

@Composable
fun Sample(modifier: Modifier = Modifier){
    Column(
        modifier = Modifier.padding(top = 27.dp)
    ){
        SampleRow { 
            Box(
                modifier = modifier
                    .width(width = 60.dp)
                    .height(height = 60.dp)
                    .clip(shape = RoundedCornerShape (size = 20.dp))
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

        SampleRow(modifier = Modifier.padding(top = 20.dp)){ //후행 람다식: 소괄호 밖에 중괄호 안에 content
            Box(
                modifier = modifier
                    .size(size=60.dp)
                    .border(
                        width = 2.dp,
                        color = Color.Black,
                        shape = RoundedCornerShape(size = 20.dp)
                    )
            )

            Box(
                modifier = modifier
                    .size(size=60.dp)
                    .border(
                        width = 2.dp,
                        color = Color.Black,
                        shape = CircleShape
                    )
            )
        }
        
        SampleRow(modifier = Modifier.padding(top = 20.dp)){
            Box(
                modifier = modifier
                    .size(size = 76.dp)
                    .border( //border 이후 padding 넣어야 내부 패딩 적용
                        width = 1.dp,
                        color = Color.Black
                    )
                    .padding(all = 8.dp)// 내부 modifier는 내부 경계 지정
                    .background(Color.Red)
            )

            Box(
                modifier = modifier
                    .size(size = 76.dp)
                    .border( //border 이후 padding 넣어야 내부 패딩 적용
                        width = 1.dp,
                        color = Color.Black,
                    )
                    .padding(all = 8.dp)// 내부 modifier는 내부 경계 지정
                    .clip(CircleShape)
                    .background(Color.Blue)
            )
        }

        SampleRow(modifier = Modifier.padding(all = 20.dp)){
            Image(
                painter = painterResource(R.drawable.image),
                contentDescription = "개 이미지",
                modifier = Modifier.size(size = 80.dp)
            )

            Image(
                painter = painterResource(R.drawable.image),
                contentDescription = "개 이미지",
                modifier = Modifier
                    .size(size = 80.dp)
                    .clip(CircleShape)
            )
        }

        Text(
            modifier = Modifier
                .padding(top = 20.dp)
                .fillMaxWidth()
                .border(width = 2.dp, color = Color.Black)
                .padding(all = 10.dp),
            text = "Hello Wordl!",
            fontSize = 20.sp,
            fontStyle = FontStyle.Normal,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            textAlign = TextAlign.Start
        )

        SampleRow(modifier = Modifier.padding(top = 50.dp)) {
            Box(
                modifier = modifier
                    .width(240.dp)
                    .height(140.dp)
                    .background(
                        color = Color.White, // 원하는 배경색
                        shape = RoundedCornerShape(10.dp)
                    )
                    .border(
                        width = 1.dp,
                        color = Color.Black,
                        shape = RoundedCornerShape(10.dp)
                    )
                    .padding(10.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.kuit),
                    contentDescription = "쿠잇 이미지",
                    modifier = Modifier
                        .size(40.dp)
                        .clip(RoundedCornerShape(10.dp))
                        .align(Alignment.TopEnd)
                )

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 46.dp)
                        .height(0.5.dp)
                        .border(
                            width = 0.5.dp,
                            color = Color.Black
                        )
                )

                Column(
                    modifier = Modifier
                        .align(Alignment.TopStart)
                        .padding(top = 54.dp)
                ) {
                    Text(
                        text ="이름 : 사예원",
                        fontSize = 10.sp,
                        color = Color.Black,
                        style = LocalTextStyle.current.copy(lineHeight = 12.sp)
                    )
                    Text(
                        modifier = modifier
                            .padding(top = 9.dp),
                        text = "학번 : 202411301",
                        fontSize = 8.sp,
                        color = Color.Black,
                        style = LocalTextStyle.current.copy(lineHeight = 10.sp)
                    )
                    Text(
                        modifier = modifier
                            .padding(top = 5.dp),
                        text = "학과 : 컴퓨터공학부",
                        fontSize = 8.sp,
                        color = Color.Black,
                        style = LocalTextStyle.current.copy(lineHeight = 10.sp)
                    )
                    Text(
                        modifier = modifier
                            .padding(top = 5.dp),
                        text = "생년월일 : 2005/10/01",
                        fontSize = 8.sp,
                        color = Color.Black,
                        style = LocalTextStyle.current.copy(lineHeight = 10.sp)
                    )
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
private fun SamplePreview(){
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Sample()
    }
}