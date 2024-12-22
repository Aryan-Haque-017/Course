package com.example.course

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.School
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.content.pm.ShortcutInfoCompat
import com.example.course.ui.theme.CourseTheme
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.course.data.Topic
import com.example.course.data.DataSource

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CourseTheme {
                Surface (
                    modifier = Modifier.fillMaxSize()
                ) {
                    CourseApp()
                }
            }
        }
    }
}
//  horizontalArrangement = Arrangement.spacedBy(4.dp),
//    style = MaterialTheme.typography.subtitle2
@Composable
fun CourseApp(modifier: Modifier = Modifier) {
    CourseList(DataSource.topics)
}
@Composable
fun EachCourseItem(topic: Topic, modifier: Modifier = Modifier) {
    Card (modifier = modifier.width(188.dp)) {
        Row  {
            Image(
                painter = painterResource(id = topic.imageResourceId),
                contentDescription = stringResource(id = topic.stringResourceId),
                modifier = modifier.size(68.dp)
            )
            Column(modifier = Modifier) {
                Spacer(modifier.height(16.dp))
                Column (modifier = modifier
                    .height(52.dp)
                    .width(104.dp)
                ) {
                    Row {
                        Spacer(modifier.width(16.dp))
                        Text(
                            text = stringResource(id = topic.stringResourceId),
                            fontSize = 12.sp
                        )
                    }
                    Spacer(modifier.height(8.dp))
                    Row (verticalAlignment = Alignment.CenterVertically) {
                        Spacer(modifier.width(16.dp))
                        Icon(
                            imageVector = Icons.Default.School,
                            contentDescription = "School Icon"
                        )
                        Spacer(modifier.width(8.dp))
                        Text(
                            text = stringResource(id = topic.numberOfCourses)
                        )
                    }
                }
            }
        }
    }
}
@Composable
fun CourseList(topicList: List<Topic>, modifier: Modifier = Modifier) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = modifier
    ) {
        items(topicList) { topic ->
            EachCourseItem(
                topic = topic
            )
        }
    }
}
@Preview
@Composable
fun CoursePreview() {
    CourseApp()
}
@Composable
fun WhatUp() {
    Text("hello")
    sdf
    sdf
    sdf
    sd
    f
    dsf
    ds
    fds
    fsd
    f
    df
    dsf
    sdf
    sdf

}