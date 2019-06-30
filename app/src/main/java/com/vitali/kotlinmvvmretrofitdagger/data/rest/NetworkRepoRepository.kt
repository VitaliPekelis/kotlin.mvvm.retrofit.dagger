package com.vitali.kotlinmvvmretrofitdagger.data.rest

import com.vitali.kotlinmvvmretrofitdagger.data.model.Repo
import io.reactivex.Single
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class NetworkRepoRepository @Inject constructor(private val repoService: RepoService) : RepoRepository {

    override fun getRepositories(): Single<List<Repo>>? {
        return repoService.getRepositories()
    }

    override  fun getRepo(owner: String, name: String): Single<Repo>? {
        return repoService.getRepo(owner, name)
    }

}