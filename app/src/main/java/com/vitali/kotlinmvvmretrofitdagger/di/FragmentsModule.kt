package com.vitali.kotlinmvvmretrofitdagger.di

import com.vitali.kotlinmvvmretrofitdagger.ui.DetailsFragment
import com.vitali.kotlinmvvmretrofitdagger.ui.ListFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentsModule {
    @ContributesAndroidInjector
    internal abstract fun provideListFragment(): ListFragment

    @ContributesAndroidInjector
    internal abstract fun provideDetailsFragment(): DetailsFragment

}
