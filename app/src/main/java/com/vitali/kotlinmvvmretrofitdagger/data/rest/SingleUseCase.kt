/*
package com.vitali.kotlinmvvmretrofitdagger.data.rest

import io.reactivex.Single
import io.reactivex.SingleObserver
import io.reactivex.SingleTransformer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.annotations.NonNull
import io.reactivex.disposables.Disposable
import io.reactivex.functions.BiConsumer
import io.reactivex.functions.Consumer
import io.reactivex.schedulers.Schedulers

abstract class SingleUseCase<T> {

    private fun  applySchedulers() : SingleTransformer<T, T> {
        return SingleTransformer {
            it.observeOn(AndroidSchedulers.mainThread()).subscribeOn(Schedulers.io())
        }
    }

    protected abstract fun buildUseCaseSingle(): Single<T>

    fun get(): Single<T> {
        return buildUseCaseSingle()
    }

    fun getTransformed(): Single<T> {
        return buildUseCaseSingle().compose(applySchedulers())
    }

    fun execute(@NonNull observer: SingleObserver<in T>) {
        getTransformed().subscribe(observer)
    }

    fun execute(singleSubscriber: BiConsumer<T, in Throwable>): Disposable {
        return getTransformed().subscribe(singleSubscriber)
    }

    fun execute(onSuccess: Consumer<in T>, onError: Consumer<in Throwable>): Disposable {
        return getTransformed().subscribe(onSuccess, onError)
    }

    fun execute() {
        getTransformed().subscribe(StubSingleSubscriber())
    }

    internal inner class StubSingleSubscriber : SingleSubscriber<T>() {
        override fun onError(throwable: Throwable?) {}
        override fun onSuccess(t: T) {}
    }
}*/
