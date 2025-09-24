package com.example.kuit6_week1

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kuit6_week1.ui.theme.Kuit6_week1Theme

@Composable
fun ProfileCard(
    name: String,
    studentId: String,
    major: String,
    birthday: String,
    modifier: Modifier = Modifier
) {
    val shape = RoundedCornerShape(10.dp)
    val lineThickness = 1.dp

    Box(
        modifier = modifier
            .size(width = 240.dp, height = 140.dp)
            .clip(shape)
            .border(1.dp, Color.Black, shape)
    ) {
        // 우상단 K 뱃지 40dp
        Image(
            painter = painterResource(R.drawable.image),
            contentDescription = "K 뱃지",
            modifier = Modifier
                .align(Alignment.TopEnd)
                .padding(10.dp)
                .size(40.dp)
                .clip(RoundedCornerShape(10.dp))
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(start = 10.dp, end = 10.dp, bottom = 0.dp),
            verticalArrangement = Arrangement.spacedBy(0.dp)
        ) {
            // 상단 → 선 중심 = 56dp
            Spacer(Modifier.height(56.dp - (lineThickness / 2)))


            Box(    
                Modifier
                    .fillMaxWidth()
                    .height(lineThickness / 2)
                    .background(Color.Black)
            )

            // 선 → 이름 = 8dp
            Spacer(Modifier.height(8.dp))

            Text(
                text = "이름 : $name",
                style = TextStyle(
                    color = Color.Black,
                    fontSize = 10.sp,
                    fontWeight = FontWeight.SemiBold,
                    platformStyle = PlatformTextStyle(includeFontPadding = false),
                    lineHeightStyle = LineHeightStyle(
                        alignment = LineHeightStyle.Alignment.Center,
                        trim = LineHeightStyle.Trim.Both
                    )
                ),
                maxLines = 1
            )

            // 이름 → 학번 9dp
            Spacer(Modifier.height(9.dp))

            Text(
                text = "학번 : $studentId",
                style = TextStyle(
                    color = Color.Black,
                    fontSize = 8.sp,
                    platformStyle = PlatformTextStyle(includeFontPadding = false),
                    lineHeightStyle = LineHeightStyle(
                        alignment = LineHeightStyle.Alignment.Center,
                        trim = LineHeightStyle.Trim.Both
                    )
                ),
                maxLines = 1
            )

            // 학번 → 학과 5dp
            Spacer(Modifier.height(5.dp))

            Text(
                text = "학과 : $major",
                style = TextStyle(
                    color = Color.Black,
                    fontSize = 8.sp,
                    platformStyle = PlatformTextStyle(includeFontPadding = false),
                    lineHeightStyle = LineHeightStyle(
                        alignment = LineHeightStyle.Alignment.Center,
                        trim = LineHeightStyle.Trim.Both
                    )
                ),
                maxLines = 1
            )

            // 학과 → 생년월일 5dp
            Spacer(Modifier.height(5.dp))

            Text(
                text = "생년월일 : $birthday",
                style = TextStyle(
                    color = Color.Black,
                    fontSize = 8.sp,
                    platformStyle = PlatformTextStyle(includeFontPadding = false),
                    lineHeightStyle = LineHeightStyle(
                        alignment = LineHeightStyle.Alignment.Center,
                        trim = LineHeightStyle.Trim.Both
                    )
                ),
                maxLines = 1
            )

        }
    }
}

@Preview(
    showBackground = true,
    device = "spec:width=360dp,height=800dp,dpi=160"
)
@Composable
private fun ProfileCardPreview() {
    Kuit6_week1Theme {
        Box(
            Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            ProfileCard(
                name = "정지훈",
                studentId = "202511030",
                major = "컴퓨터공학부",
                birthday = "2006/02/22"
            )
        }
    }
}
