package com.vitali.kotlinmvvmretrofitdagger.di

import com.vitali.kotlinmvvmretrofitdagger.base.App
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector


import dagger.android.DaggerApplication
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class, AndroidSupportInjectionModule::class, ActivitiesBindingModule::class])
interface ApplicationComponent : AndroidInjector<DaggerApplication> {

    fun inject(application: App)

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(app: App):Builder
        fun setNetworkModel(model:NetworkModule):Builder
        fun build():ApplicationComponent
    }

}