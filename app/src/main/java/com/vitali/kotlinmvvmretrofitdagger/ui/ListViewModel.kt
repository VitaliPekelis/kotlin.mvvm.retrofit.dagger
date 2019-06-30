package com.vitali.kotlinmvvmretrofitdagger.ui

import androidx.lifecycle.ViewModel
import com.vitali.kotlinmvvmretrofitdagger.data.rest.NetworkRepoRepository
import com.vitali.kotlinmvvmretrofitdagger.data.rest.RepoRepository
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ListViewModel @Inject constructor(): ViewModel() {

     @Inject lateinit var repoRepository : RepoRepository
     var disposable: CompositeDisposable? = CompositeDisposable()



     fun start(){
          println()
     }


     override fun onCleared() {
          super.onCleared()
          disposable?.clear()
          disposable = null
     }
}