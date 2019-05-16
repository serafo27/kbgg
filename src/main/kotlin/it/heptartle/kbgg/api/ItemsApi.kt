package it.heptartle.kbgg.api

import it.heptartle.kbgg.domain.Items
import it.heptartle.kbgg.domain.Type
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ItemsApi {
    @GET("hot")
    fun hot(@Query("type") type: Type? = null): Call<Items>
}

