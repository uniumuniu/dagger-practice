package com.uniumuniu.daggerpractice.di

import android.app.Application
import com.uniumuniu.daggerpractice.AuthActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(modules = [ActivityBuildersModule::class, AppModule::class])
interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }

    fun inject(authActivity: AuthActivity)
}