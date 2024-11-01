package com.uuthman.socialmediaapp.presentation.user.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.uuthman.socialmediaapp.domain.Post

@Composable
fun PostTile(
    modifier: Modifier,
    post: Post
) {
    Box(modifier = Modifier
        .fillMaxWidth()
        .background(Color.Gray)


    ) {

    }
    Column(
        modifier = modifier
    ) {
        Text(
            text = post.title,
            color = Color.Black
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = post.description,
            color =  Color.Black
        )
    }
}