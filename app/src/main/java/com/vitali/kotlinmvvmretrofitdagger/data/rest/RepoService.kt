package com.vitali.kotlinmvvmretrofitdagger.data.rest

import com.vitali.kotlinmvvmretrofitdagger.data.model.Repo
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path

interface RepoService {

    @GET("orgs/Google/repos")
    fun getRepositores() : Single<List<Repo>>

    @GET("repos/{owner}/{name}")
    fun getRepo(@Path("owner") owner:String, @Path("name") name:String)
}