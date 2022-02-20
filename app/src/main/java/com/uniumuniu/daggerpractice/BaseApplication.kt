package com.uniumuniu.daggerpractice

import android.app.Application
import com.uniumuniu.daggerpractice.di.AppComponent
import com.uniumuniu.daggerpractice.di.DaggerAppComponent

class BaseApplication: Application() {
    val appComponent: AppComponent = DaggerAppComponent.builder().application(this).build()
}