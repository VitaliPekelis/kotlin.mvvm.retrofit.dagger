package com.vitali.kotlinmvvmretrofitdagger
import com.vitali.kotlinmvvmretrofitdagger.di.DaggerApplicationComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class App: DaggerApplication() {


    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerApplicationComponent.builder()
            .application(this)
            .build().also {
                it.inject(this)
            }
    }

}