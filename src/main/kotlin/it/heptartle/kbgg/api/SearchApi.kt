package it.heptartle.kbgg.api

import it.heptartle.kbgg.domain.Items
import it.heptartle.kbgg.domain.Type
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface SearchApi {
    @GET("search")
    fun search(@Query("query") query: String,
               @Query("type") type: Type? = null,
               @Query("exact") exact: Int? = null
    ): Call<Items>
}