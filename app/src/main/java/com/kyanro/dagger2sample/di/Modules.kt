package com.kyanro.dagger2sample.di

import android.app.Application
import com.kyanro.dagger2sample.MainActivity
import com.kyanro.dagger2sample.data.repo.AppRepo
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector
import javax.inject.Singleton

@Module
class AppModule {
    @Provides
    @Singleton
    fun provideAppRepo(app: Application): AppRepo = AppRepo(app)

//    @Provides
//    @Singleton
//    fun provideNameRepo(name: String): NameRepo = NameRepo(name)
}

@Module
abstract class ActivityModule {
    @ContributesAndroidInjector
    abstract fun contributeMainActivity(): MainActivity
}
