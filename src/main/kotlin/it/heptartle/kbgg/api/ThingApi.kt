package it.heptartle.kbgg.api

import it.heptartle.kbgg.domain.Items
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ThingApi {

    @GET("thing")
    fun getThing(@Query("id") thingId: String,
                 @Query("stats") stats: Int = 0,
                 @Query("videos") videos: Int = 0,
                 @Query("marketplace") marketplace: Int = 0
    ): Call<Items>

}
