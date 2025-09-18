package com.example.kuit6_week1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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

            }
        }
    }
}

@Composable
fun NameCard(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier.padding(top = 45.dp)
    ) {
        SampleRow(modifier = Modifier.padding(top = 20.dp)) {
            Box(
                modifier
                    .size(240.dp, 140.dp)
                    .border(
                        width = 1.dp,
                        color = Color.Black,
                        shape = RoundedCornerShape(16.dp)
                    )
                    .padding(10.dp),
                //verticalAlignment = Alignment.CenterVertically 여기서 이걸 쓰고싶은데 왜 이걸 쓰자마자 다른 함수들에서 오류가 발생하는지 모르겠습니다..
            ) { //박스 함수의 시작점.
                Image(
                    painter = painterResource(R.drawable.image2),
                    contentDescription = "쿠잇 로고 이미지",
                    modifier = Modifier
                        .size(40.dp, 40.dp)
                        .align(Alignment.TopEnd)
                )

                Divider(
                    color = Color.Black,
                    thickness = 0.5.dp,
                    modifier = Modifier.padding(top = 46.dp),
                )

                Text(
                    modifier = modifier
                        .padding(top = 54.dp),

                    text = "이름 : 권태우",
                    fontSize = 10.sp,
                )

                Text(
                    modifier = modifier
                        .padding(top = 75.dp),

                    text = "학번 : 202510939",
                    fontSize = 8.sp,
                )

                Text(
                    modifier = modifier
                        .padding(top = 90.dp),

                    text = "학과 : 컴퓨터공학부",
                    fontSize = 8.sp,
                )

                Text(
                    modifier = modifier
                        .padding(top = 105.dp),

                    text = "생년월일 : 2003/04/05",
                    fontSize = 8.sp,
                )

            }
        }
    }
}

/*
SampleRow(
    modifier = Modifier.padding(top = 20.dp)
) {
    Image (
        painter = painterResource(R.drawable.image2),
        contentDescription = "쿠잇 로고 이미지",
        modifier = Modifier.size(80.dp)
    )
}*/


/*
@Composable
fun Sample(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier.padding(top = 27.dp)
    ) {
        SampleRow {
            Box(
                modifier = modifier
                    .width(60.dp)
                    .height(height = 60.dp)
                    .clip(RoundedCornerShape(20.dp))
                    .background(Color.Black)
            )

            Box(
                modifier = modifier
                    .width(60.dp)
                    .height(height = 60.dp)
                    .clip(CircleShape)
                    .background(Color.Black)
            )
        }


        SampleRow(modifier = Modifier.padding(top = 20.dp)) {
            Box(
                modifier
                    .size(60.dp)
                    .border(
                        width = 2.dp,
                        color = Color.Black,
                        shape = RoundedCornerShape(20.dp)
                    )
            )

            Box(
                modifier
                    .size(60.dp)
                    .border(
                        width = 2.dp,
                        color = Color.Black,
                        shape = CircleShape
                    )
            )
        }

        SampleRow(
            modifier = Modifier.padding(top = 20.dp)
        ) {
            Box(
                modifier
                    .size(size = 76.dp)
                    .border(
                        width = 1.dp,
                        color = Color.Black
                    )
                    .padding(all = 8.dp)
                    .background(Color.Red)
            )

            Box(
                modifier
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
            Image (
                painter = painterResource(R.drawable.image),
                contentDescription = "개 이미지",
                modifier = Modifier.size(80.dp)
            )

            Image (
                painter = painterResource(R.drawable.image),
                contentDescription = "개 이미지",
                modifier = Modifier
                    .size(80.dp)
                    .clip(CircleShape)
            )
        }
    }
}


*/

@Preview(showBackground = true)
@Composable
private fun NameCardreview() {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        NameCard()
    }
}

