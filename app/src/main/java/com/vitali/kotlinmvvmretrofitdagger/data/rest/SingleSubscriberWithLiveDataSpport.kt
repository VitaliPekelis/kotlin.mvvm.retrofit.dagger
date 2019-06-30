/*
package com.vitali.kotlinmvvmretrofitdagger.data.rest

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.MutableLiveData

abstract class SingleSubscriberWithLiveDataSpport <T> constructor (private val lifecycleOwner:LifecycleOwner) : SingleSubscriber<T>() {

    private val liveDataValue: MutableLiveData<T> = MutableLiveData()
    private val liveDataError: MutableLiveData<Throwable> = MutableLiveData()

    init {
        liveDataValue.observe(lifecycleOwner, ::onResponse)
        liveDataError.observe(lifecycleOwner, ::onFail)
    }

    override fun onSuccess(response: T) {
        liveDataValue.value = response
    }

    override fun onError(throwable: Throwable?) {
        liveDataError.value = throwable
    }

    abstract fun onFail(e: Throwable)

    abstract fun onResponse(value: T)
}*/
