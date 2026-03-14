package com.example.kuit6_week1

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

//피그마
///* Profile Card */
//
//box-sizing: border-box;
//
//position: relative;
//width: 490px;
//height: 255px;
//
//background: #FFFFFF;
//border: 1px solid rgba(255, 255, 255, 0.1);
//border-radius: 1.54308px;
//
//
///* Rectangle 3 */
//
//box-sizing: border-box;
//
//position: absolute;
//width: 140px;
//height: 240px;
//left: 45px;
//top: 45px;
//
//background: #FFFFFF;
//border: 1px solid #000000;
//border-radius: 10px;
//transform: rotate(90deg);
//
//
///* image 2 */
//
//position: absolute;
//width: 40px;
//height: 40px;
//left: 235px;
//top: 55px;
//
//background: url(140745540.png);
//border-radius: 10px;
//
//
///* 이름 : 조규빈 */
//
//position: absolute;
//width: 55px;
//height: 12px;
//left: 55px;
//top: 109px;
//
//font-family: 'Inter';
//font-style: normal;
//font-weight: 400;
//font-size: 10px;
//line-height: 12px;
//
//color: #1E1E1E;
//
//
//
///* 학번 : 202012362 */
//
//position: absolute;
//width: 65px;
//height: 10px;
//left: 55px;
//top: 130px;
//
//font-family: 'Inter';
//font-style: normal;
//font-weight: 400;
//font-size: 8px;
//line-height: 10px;
///* 상자 높이와 동일 */
//
//color: #1E1E1E;
//
//
//
///* 학과 : 스마트ICT융합공학과 */
//
//position: absolute;
//width: 94px;
//height: 10px;
//left: 55px;
//top: 145px;
//
//font-family: 'Inter';
//font-style: normal;
//font-weight: 400;
//font-size: 8px;
//line-height: 10px;
///* 상자 높이와 동일 */
//
//color: #1E1E1E;
//
//
//
///* 생년월일 : 2001/05/29 */
//
//position: absolute;
//width: 81px;
//height: 10px;
//left: 55px;
//top: 160px;
//
//font-family: 'Inter';
//font-style: normal;
//font-weight: 400;
//font-size: 8px;
//line-height: 10px;
///* 상자 높이와 동일 */
//
//color: #1E1E1E;
//
//
//
///* Line 1 */
//
//position: absolute;
//width: 220px;
//height: 0px;
//left: 55px;
//top: 101px;
//
//border: 0.5px solid #000000;

@Composable
fun ProfileCard(modifier: Modifier = Modifier) {
    Box(
        modifier
//            .width(490.dp)
            .size(width = 490.dp, height = 255.dp)
            .padding(
                top = 45.dp, bottom = 70.dp, start = 45.dp, end = 205.dp
            )
    ) {
        Column(
            modifier = Modifier
//                .width(240.dp)
//                .size(width = 140.dp, height = 240.dp)
                .size(width = 240.dp, height = 140.dp)
                .border(
                    width = 1.dp, color = Color.Black,
                    shape = RoundedCornerShape(10.dp)
                )
                .padding(10.dp)
        ) {
            Row(
                Modifier
                    .padding(bottom = 6.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.End
            ) {
                Image(
                    painter = painterResource(R.drawable.image2),
                    contentDescription = "KUIT",
                    modifier = Modifier
                        .size(40.dp)
                )
            }

            HorizontalDivider(
                thickness = 0.5.dp
            )

            Text(
                "이름 : 정일혁",
                modifier = Modifier
                    .width(55.dp)
                    .padding(top = 8.dp),
                fontSize = 10.sp,
//                fontFamily = FontFamily.I
            )

            Text(
                "학번 : 202111373",
                modifier = Modifier
                    .width(65.dp)
                    .padding(top = 9.dp),
                fontSize = 8.sp,
            )
            Text(
                text = "학과 : 컴퓨터공학부",
                modifier = Modifier
                    .width(94.dp)
                    .padding(top = 5.dp),
                fontSize = 8.sp,
            )
            Text(
                "생년월일 : 2000/05/03",
                modifier = Modifier
                    .width(81.dp)
                    .padding(top = 5.dp, bottom = 5.dp),
                fontSize = 8.sp,
            )
        }
    }
}

@Preview(
    showBackground = true,
    widthDp = 490,    // Preview 너비 늘리기
    heightDp = 255    // Preview 높이 늘리기
)
@Composable
private fun ProfileCardPreview() {
    ProfileCard()
}