package com.vitali.kotlinmvvmretrofitdagger.di

import com.vitali.kotlinmvvmretrofitdagger.App
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector


import dagger.android.DaggerApplication
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(ApplicationModule::class, AndroidSupportInjectionModule::class))
interface ApplicationComponent : AndroidInjector<DaggerApplication> {

    fun inject(application: App)

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(app:App):Builder
        fun build():ApplicationComponent
    }

}