package com.uuthman.socialmediaapp.presentation.user

import com.uuthman.socialmediaapp.domain.Post

data class UserState(
    val posts: List<Post> = emptyList()
)