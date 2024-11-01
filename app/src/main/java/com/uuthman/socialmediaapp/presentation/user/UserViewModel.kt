package com.uuthman.socialmediaapp.presentation.user

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.uuthman.socialmediaapp.domain.PostRepository

class UserViewModel(
    private val postRepository: PostRepository
): ViewModel() {

    var state by mutableStateOf(UserState())
        private set

    init {
        viewPosts()
    }


    private fun viewPosts() {
        val data = postRepository.posts()
        state = state.copy(posts = data)
    }
}