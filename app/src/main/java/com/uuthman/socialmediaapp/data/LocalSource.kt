package com.uuthman.socialmediaapp.data

class LocalSource {
    fun data(): PostResponse {
        val data = listOf(
            PostDto(
                title = "My name",
                description = "My name is Uthman"
            ),
            PostDto(
                title = "My name",
                description = "My name is Uthman"
            ),
            PostDto(
                title = "My name",
                description = "My name is Uthman"
            )
        )

        return  PostResponse(posts = data)
    }
}