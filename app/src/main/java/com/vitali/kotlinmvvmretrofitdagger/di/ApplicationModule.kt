package com.vitali.kotlinmvvmretrofitdagger.di

import com.vitali.kotlinmvvmretrofitdagger.data.rest.RepoService
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import javax.inject.Singleton

@Module
open class ApplicationModule {

    private val BASE_URL = "https://api.github.com/"

    @Singleton
    @Provides
    internal fun provideRetrofit() : Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()
    }


    @Singleton
    @Provides
    internal fun provideRetrofitService(retrofit: Retrofit): RepoService {
        return retrofit.create<RepoService>(RepoService::class.java)
    }

}
