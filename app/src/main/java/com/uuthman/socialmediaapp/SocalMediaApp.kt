package com.uuthman.socialmediaapp

import android.app.Application
import com.uuthman.socialmediaapp.di.userModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class SocalMediaApp: Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()
            androidContext(this@SocalMediaApp)
            modules(
                userModule
            )
        }
    }
}