package it.heptartle.kbgg.api.bgg

import it.heptartle.kbgg.domain.bgg.Forum
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ForumApi {

    @GET("forum")
    fun getForum(@Query("id") forumId:Int): Call<Forum>

}