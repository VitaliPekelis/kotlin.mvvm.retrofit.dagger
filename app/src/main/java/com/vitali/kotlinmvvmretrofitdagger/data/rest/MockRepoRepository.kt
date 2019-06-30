package com.vitali.kotlinmvvmretrofitdagger.data.rest

import com.vitali.kotlinmvvmretrofitdagger.data.model.Repo
import io.reactivex.Single

class MockRepoRepository : RepoRepository {

    override fun getRepositories(): Single<List<Repo>>? {
         //To change body of created functions use File | Settings | File Templates.
        return null
    }

    override fun getRepo(owner: String, name: String): Single<Repo>? {
        //To change body of created functions use File | Settings | File Templates.
        return null
    }
}