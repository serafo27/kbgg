package it.heptartle.kbgg.api.bgg

import it.heptartle.kbgg.domain.bgg.ThreadDetail
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ThreadApi {

    @GET("thread")
    fun getThread(@Query("id") threadId: String,
                  @Query("count") count: Int? = null,
                  @Query("minarticleid") minarticleid: String? = null
    ): Call<ThreadDetail>

}