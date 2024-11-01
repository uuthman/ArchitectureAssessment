package com.uuthman.socialmediaapp.data

import com.uuthman.socialmediaapp.domain.Post

fun PostDto.toPost(): Post {
    return Post(
        title = title,
        description = description
    )
}

fun PostResponse.toPosts(): List<Post> {
    return posts.map { it.toPost() }
}