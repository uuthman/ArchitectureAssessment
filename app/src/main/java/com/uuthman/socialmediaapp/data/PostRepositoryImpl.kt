package com.uuthman.socialmediaapp.data

import com.uuthman.socialmediaapp.domain.Post
import com.uuthman.socialmediaapp.domain.PostRepository

class PostRepositoryImpl(
    private val localSource: LocalSource
): PostRepository {

    override fun posts(): List<Post> {
        return localSource.data().toPosts()
    }
}