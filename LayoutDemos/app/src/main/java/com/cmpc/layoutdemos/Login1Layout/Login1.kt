package com.cmpc.layoutdemos.Login1Layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.cmpc.layoutdemos.ui.theme.LayoutDemosTheme

@Composable
fun Login1(modifier: Modifier = Modifier) {
    ConstraintLayout(
        modifier
            .fillMaxSize()
            .padding(5.dp)

    ) {
        val (box) = createRefs()

        Box(
            modifier = Modifier
                .fillMaxWidth(0.8f)
                .fillMaxHeight(0.5f)
                .background(Color.Blue)
                .constrainAs(box) {
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
        ) {
            Column(modifier.fillMaxWidth(1f)) {

                Box(
                    modifier
                        .weight(3f)
                        .fillMaxWidth()
                        .background(Color.Green)
                )
                Box(
                    modifier
                        .weight(5f)
                        .fillMaxWidth()
                        .background(Color.Red)
                )
                {
                    ConstraintLayout(
                        modifier
                            .fillMaxSize()
                            .padding(5.dp)

                    ) {
                        val (button1, button2) = createRefs()

                        Text("Username",
                            modifier = Modifier
                                .fillMaxWidth()
                                .constrainAs(button1) {
                                    top.linkTo(parent.top)
                                    start.linkTo(parent.start)
                                    end.linkTo(parent.end)
                                }
                        )


                    }
                }
                Box(
                    modifier
                        .weight(1f)
                        .fillMaxWidth()
                        .background(Color.Yellow)
                ) {

                    LoginButtons()
                }

            }
        }

    }
}


@Composable
fun LoginButtons(modifier: Modifier = Modifier) {
    ConstraintLayout(
        modifier
            .fillMaxSize()
            .padding(5.dp)

    ) {
        val (button1, button2) = createRefs()

        Button(
            onClick = { /* Do something */ },
            modifier = Modifier
                .width(100.dp)
                .height(50.dp)
                .constrainAs(button1) {
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(button2.start)
                }
        ) {
            Text(text = "Button 1")
        }

        Button(
            onClick = { /* Do something */ },
            modifier = Modifier
                .width(100.dp)
                .height(50.dp)
                .constrainAs(button2) {
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    end.linkTo(parent.end)
                    start.linkTo(button1.end)
                }
        ) {
            Text(text = "Button 2")
        }
    }
}


@Preview(showBackground = true, showSystemUi = true, device = "id:pixel_9")
@Composable
fun GreetingPreview() {
    LayoutDemosTheme {
        Login1()
    }
}