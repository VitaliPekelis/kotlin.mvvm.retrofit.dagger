package com.vitali.kotlinmvvmretrofitdagger.di

import com.vitali.kotlinmvvmretrofitdagger.ui.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector


/**
 *   internal is an alternative to Java’s package-private.
 *   internal means that the declarations are visible inside a module.
 */

@Module
abstract class ActivitiesModule {
    @ContributesAndroidInjector(modules = [FragmentsModule::class])
    internal abstract fun provideMainActivity(): MainActivity
}
