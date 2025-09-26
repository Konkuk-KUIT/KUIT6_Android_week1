package com.example.kuit6_week1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Scaffold
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
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    CardAssignment(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun CardAssignment(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .padding(all = 45.dp)
            .size(width = 240.dp, height = 140.dp)
            .border(
                width = 1.dp,
                color = Color.Black,
                shape = RoundedCornerShape(size = 10.dp)
            )
            .padding(all = 10.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxWidth()
        ){
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.End
            ) {
                Image(
                    painter = painterResource(R.drawable.image2),
                    contentDescription = "쿠잇 로고 이미지",
                    modifier = Modifier
                        .size(size = 40.dp)
                        .clip(shape = RoundedCornerShape(size = 10.dp))
                )
            }

            HorizontalDivider(
                thickness = 1.dp,
                color = Color.Black,
                modifier = Modifier
                    .padding(top = 6.dp, bottom = 8.dp)
            )

            Text(
                text = "이름 : 서아영",
                fontSize = 10.sp, // sp: Scale-Independent Pixels, 레이아웃을 정의할 때 텍스트의 크기를 지정하기 위해 사용
                modifier = Modifier
                    .padding(bottom = 8.dp)
                    .height(12.dp)
            )
            InfoText("학번 : 202411302")
            InfoText("학과 : 컴퓨터공학부")
            InfoText("생년월일 : 2005/10/09")
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun CardPreview() {
    Box (
        modifier = Modifier.fillMaxSize()
    ) {
        CardAssignment()
    }
}

/*
package com.example.kuit6_week1

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun SampleRow(
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    Row (
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        content()
    }
}
// // // // //
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

            }
        }
    }
}

@Composable
fun Sample(modifier: Modifier = Modifier) {
    Column (
        modifier = Modifier.padding(top=27.dp)
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
            // 후행 람다식
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
                    .padding(all = 8.dp)    // 보더 다음 패딩 => 보더 안의 패딩
                    .background(Color.Red)
            )

            Box(
                modifier = modifier
                    .size(size = 76.dp)
                    .border(
                        width = 1.dp,
                        color = Color.Black
                    )
                    .padding(all = 8.dp)    // 보더 다음 패딩 => 보더 안의 패딩(내부 여백)
                    .clip(CircleShape)      // 먼저 clip 후 칠
                    .background(Color.Blue)
            )
        }

        SampleRow(
            modifier = Modifier.padding(20.dp)
        ){
            Image (
                painter = painterResource(R.drawable.image),
                contentDescription = "개 이미지",
                modifier = Modifier.size(size = 80.dp)
            )

            Image (
                painter = painterResource(R.drawable.image),
                contentDescription = "개 이미지",
                modifier = Modifier
                    .size(size = 80.dp)
                    .clip(CircleShape)
            )
        }

        Text (
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

@Preview (showBackground = true)
@Composable
private fun SamplePreview() {
    Box (
        modifier = Modifier.fillMaxSize()
    ){
        Sample()
    }
}
*/