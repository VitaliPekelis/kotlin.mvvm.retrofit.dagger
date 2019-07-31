package com.vitali.kotlinmvvmretrofitdagger.di

import com.facebook.stetho.okhttp3.StethoInterceptor
import com.vitali.kotlinmvvmretrofitdagger.BuildConfig
import com.vitali.kotlinmvvmretrofitdagger.data.rest.MockRepoRepository
import com.vitali.kotlinmvvmretrofitdagger.data.rest.NetworkRepoRepository
import com.vitali.kotlinmvvmretrofitdagger.data.rest.RepoRepository
import com.vitali.kotlinmvvmretrofitdagger.data.rest.RepoService
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import javax.inject.Singleton

@Module
class NetworkModule constructor(private val isMockNetwork:Boolean) {

    private val BASE_URL = "https://api.github.com/"

    @Singleton
    @Provides
    internal fun provideRetrofit(): Retrofit{
        val clientBuilder = OkHttpClient.Builder()
        if(BuildConfig.DEBUG){
            clientBuilder.addNetworkInterceptor(StethoInterceptor())
        }

        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(clientBuilder.build())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()
    }

    @Singleton
    @Provides
    internal fun provideRetrofitService(retrofit: Retrofit): RepoService{
        return retrofit.create<RepoService>(RepoService::class.java)
    }

    @Singleton
    @Provides
    internal fun provideRepoRepository(repoService: RepoService): RepoRepository{
        return if(isMockNetwork) MockRepoRepository() else NetworkRepoRepository(repoService)
    }
}