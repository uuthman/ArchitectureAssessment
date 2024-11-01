package com.uuthman.socialmediaapp.presentation.user

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import androidx.compose.ui.graphics.Color
import com.uuthman.socialmediaapp.presentation.user.components.PostTile
import androidx.compose.foundation.lazy.items
import org.koin.androidx.compose.koinViewModel


@Composable
fun UserScreenRoot(

) {
    UserScreen()
}

@Composable
fun UserScreen(
    viewModel: UserViewModel = koinViewModel()
) {

    Box (
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        LazyColumn {
            items(viewModel.state.posts) { post ->
                PostTile(
                    modifier = Modifier,
                    post = post
                )
            }
        }
}
}