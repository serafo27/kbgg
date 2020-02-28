package it.heptartle.kbgg.api.bgg

import it.heptartle.kbgg.domain.bgg.Items
import it.heptartle.kbgg.domain.bgg.SearchTypes
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