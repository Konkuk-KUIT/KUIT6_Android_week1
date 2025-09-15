package com.example.kuit6_week1.ui.component

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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kuit6_week1.R
import com.example.kuit6_week1.model.user.Profile

@Composable
fun ProfileCard(profile: Profile) {
    Box(
        modifier = Modifier
            .width(240.dp)
            .height(140.dp)
            .border(
                width = 1.dp,
                color = Color.Black,
                shape = RoundedCornerShape(10.dp)
            )
    ) {
        Column {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp, end = 10.dp),
                horizontalArrangement = Arrangement.End
            ) {
                Image(
                    painter = painterResource(id = R.drawable.kuit),
                    contentDescription = "KU IT",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .width(40.dp)
                        .height(40.dp)
                        .clip(RoundedCornerShape(10.dp))
                )
            }
            HorizontalDivider(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 10.dp, end = 10.dp, top = 6.dp),
                thickness = 0.5.dp,
                color = Color.Black
            )
            Text(
                "이름 : ${profile.name}",
                modifier = Modifier.padding(
                    start = 10.dp,
                    top = 8.dp
                ),
                fontSize = 10.sp
            )
            Text(
                "학번 : ${profile.studentId}",
                modifier = Modifier.padding(
                    start = 10.dp,
                    top = 9.dp
                ),
                fontSize = 8.sp
            )
            Text(
                "전공 : ${profile.major}",
                modifier = Modifier.padding(
                    start = 10.dp,
                    top = 5.dp
                ),
                fontSize = 8.sp
            )
            Text(
                "생년 월일 : ${profile.birth}",
                modifier = Modifier.padding(
                    start = 10.dp,
                    top = 5.dp
                ),
                fontSize = 8.sp
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ProfileCardPreview() {
    Box(modifier = Modifier.fillMaxSize()) {
        ProfileCard(
            Profile(
                name = "이준혁",
                studentId = 202111351,
                major = "컴퓨터 공학부",
                birth = "2003/03/13"
            )
        )
    }
}