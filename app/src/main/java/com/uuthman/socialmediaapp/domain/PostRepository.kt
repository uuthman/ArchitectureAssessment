package com.uuthman.socialmediaapp.domain

interface PostRepository {
    fun posts(): List<Post>
}