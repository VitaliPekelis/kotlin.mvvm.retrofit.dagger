package com.vitali.kotlinmvvmretrofitdagger.data.rest

import com.vitali.kotlinmvvmretrofitdagger.data.model.Repo
import io.reactivex.Single

interface RepoRepository {
    fun getRepositories(): Single<List<Repo>>?
    fun getRepo(owner: String, name: String): Single<Repo>?

}
