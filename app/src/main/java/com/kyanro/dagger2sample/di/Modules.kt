package com.kyanro.dagger2sample.di

import com.kyanro.dagger2sample.MainActivity
import com.kyanro.dagger2sample.MyApplication
import com.kyanro.dagger2sample.data.repo.AppRepo
import com.kyanro.dagger2sample.data.repo.NameRepo
import com.kyanro.dagger2sample.data.repo.StringRepo
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector
import javax.inject.Singleton

@Module
class AppModule {
    @Provides
    @Singleton
    fun provideAppRepo(app: MyApplication): AppRepo = AppRepo(app)

    @Provides
    @Singleton
    fun provideNameRepo(name: String): NameRepo = NameRepo(name)

    @Provides
    @Singleton
    fun provideStringRepo(name: String): StringRepo = StringRepo(name)
}

@Module
abstract class ActivityModule {
    @ContributesAndroidInjector
    abstract fun contributeMainActivity(): MainActivity
}
