/*
package com.vitali.kotlinmvvmretrofitdagger.data.rest

import io.reactivex.functions.BiConsumer

abstract class SingleSubscriber<T> : BiConsumer<T, Throwable> {

    override fun accept(response: T, throwable: Throwable?) {
        if (response != null) {
            onSuccess(response)
        } else {
            onError(throwable)
        }
    }

    abstract fun onSuccess(response: T)

    abstract fun onError(throwable: Throwable?)
}*/
