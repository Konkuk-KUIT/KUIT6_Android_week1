package com.example.kuit6_week1.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight.Companion.W400
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kuit6_week1.R

@Composable
fun ProfileCard2(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .border(
                width = 1.dp,
                color = Color.Black,
                shape = RoundedCornerShape(size = 16.dp)
            )
            .padding(
                start = 10.dp,
                top = 10.dp,
                end = 10.dp,
                bottom = 15.dp,
            )
    ) {
        Image(
            painter = painterResource(id = R.drawable.kuit),
            contentDescription = "kuit",
            modifier = Modifier
                .size(40.dp)
                .align(
                    alignment = Alignment.End
                )
        )

        Spacer(modifier = Modifier.height(height = 6.dp))

        HorizontalDivider(
            modifier = Modifier.width(240.dp),
        )
        Spacer(modifier = Modifier.height(height = 8.dp))

        Text(
            text = "이름 : 정일혁",
            fontSize = 10.sp,
            fontWeight = W400
        )
        Spacer(modifier = Modifier.height(height = 9.dp))

        Text(
            text = "학번 : 202111373",
            fontWeight = W400,
            fontSize = 8.sp
        )

        Spacer(modifier = Modifier.height(height = 5.dp))
        Text(
            text = "학과 : 컴퓨터공학부",
            fontWeight = W400,
            fontSize = 8.sp
        )

        Spacer(modifier = Modifier.height(height = 5.dp))
        Text(
            text = "생년월일 : 2000/05/03",
            fontWeight = W400,
            fontSize = 8.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun ProfileCard2Preview() {
    ProfileCard2()
}