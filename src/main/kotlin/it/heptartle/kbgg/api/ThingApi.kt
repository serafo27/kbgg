package it.heptartle.kbgg.api

import it.heptartle.kbgg.domain.Items
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ThingApi {

    @GET("thing")
    fun getThing(@Query("id") thingId: Int): Call<Items>

}
