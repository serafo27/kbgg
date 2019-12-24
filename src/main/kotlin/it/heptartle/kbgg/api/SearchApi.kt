package it.heptartle.kbgg.api

import it.heptartle.kbgg.domain.Items
import it.heptartle.kbgg.domain.SearchTypes
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface SearchApi {
    @GET("search")
    fun search(@Query("query") query: String,
               @Query("type") type: SearchTypes? = null,
               @Query("exact") exact: Int = 0
    ): Call<Items>
}