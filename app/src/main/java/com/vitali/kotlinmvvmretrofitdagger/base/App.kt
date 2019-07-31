package com.vitali.kotlinmvvmretrofitdagger.base
import com.facebook.stetho.Stetho
import com.vitali.kotlinmvvmretrofitdagger.BuildConfig
import com.vitali.kotlinmvvmretrofitdagger.di.DaggerApplicationComponent
import com.vitali.kotlinmvvmretrofitdagger.di.NetworkModule
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class App: DaggerApplication() {

    override fun onCreate() {
        super.onCreate()
        if(BuildConfig.DEBUG){
            Stetho.initializeWithDefaults(this)
        }
    }


    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerApplicationComponent.builder()
            .application(this)
            .setNetworkModel(NetworkModule(isMockNetwork()))
            .build().also {
                it.inject(this)
            }
    }

    private fun isMockNetwork(): Boolean {
        //TODO Vitali change to true if you need the Mock Network for UniTesting
        return false
    }

}