package com.uuthman.socialmediaapp.di

import com.uuthman.socialmediaapp.data.LocalSource
import com.uuthman.socialmediaapp.data.PostRepositoryImpl
import com.uuthman.socialmediaapp.domain.PostRepository
import com.uuthman.socialmediaapp.presentation.user.UserViewModel
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val userModule = module {
    single {
        LocalSource()
    }

    singleOf(::PostRepositoryImpl).bind<PostRepository>()

    viewModelOf(::UserViewModel)
}