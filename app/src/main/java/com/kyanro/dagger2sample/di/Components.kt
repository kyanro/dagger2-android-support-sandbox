package com.kyanro.dagger2sample.di

import com.kyanro.dagger2sample.MyApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import javax.inject.Named
import javax.inject.Singleton

@Singleton
@Component(modules = [
    AppModule::class,
    ActivityModule::class
])
interface AppComponent : AndroidInjector<MyApplication> {

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<MyApplication>() {
        @BindsInstance
        abstract fun name(@Named("name") name: String): Builder

        @BindsInstance
        abstract fun string(@Named("string") name: String): Builder
    }
}