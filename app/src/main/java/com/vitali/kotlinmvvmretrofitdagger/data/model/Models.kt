package com.vitali.kotlinmvvmretrofitdagger.data.model

import com.google.gson.annotations.SerializedName;

data class Repo(val id:Long, val name:String, val description: String, val owner:User, @SerializedName("stargazers_count") val  star :Long , @SerializedName("forks_count") val forks: Long)

data class User(val login:String)