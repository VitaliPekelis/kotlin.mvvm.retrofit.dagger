package com.vitali.kotlinmvvmretrofitdagger.di

import androidx.lifecycle.ViewModelProvider
import com.vitali.kotlinmvvmretrofitdagger.base.ViewModelFactory
import dagger.Binds
import dagger.Module

@Module
abstract class ViewModelModule {

    @Binds
    internal abstract fun provideViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory
}