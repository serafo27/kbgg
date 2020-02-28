package it.heptartle.kbgg.api.geekdo

import it.heptartle.kbgg.domain.geekdo.Reviews
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ReviewsApi {

    @GET("reviews")
    fun getReviews(@Query("objectid") objectid:Int,
                   @Query("ajax") ajax:Int = 1,
                   @Query("objecttype") objecttype:String = "thing",
                   @Query("pageid") pageid:Int = 1
                   ): Call<Reviews>
}