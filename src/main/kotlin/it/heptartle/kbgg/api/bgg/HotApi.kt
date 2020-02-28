package it.heptartle.kbgg.api.bgg

import it.heptartle.kbgg.domain.bgg.Items
import it.heptartle.kbgg.domain.bgg.Type
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface HotApi {
    @GET("hot")
    fun hot(@Query("type") type: Type? = null): Call<Items>
}

