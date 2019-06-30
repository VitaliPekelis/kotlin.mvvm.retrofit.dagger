package com.vitali.kotlinmvvmretrofitdagger.di

import dagger.Module

@Module(includes = [ViewModelModule::class, NetworkModule::class])
class ApplicationModule {



}
