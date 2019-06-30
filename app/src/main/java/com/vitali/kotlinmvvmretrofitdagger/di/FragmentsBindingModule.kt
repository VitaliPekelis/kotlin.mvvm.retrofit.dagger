package com.vitali.kotlinmvvmretrofitdagger.di

import com.vitali.kotlinmvvmretrofitdagger.ui.DetailsFragment
import com.vitali.kotlinmvvmretrofitdagger.ui.ListFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentsBindingModule {
    @ContributesAndroidInjector
    internal abstract fun bindListFragment(): ListFragment

    @ContributesAndroidInjector
    internal abstract fun bindDetailsFragment(): DetailsFragment

}
