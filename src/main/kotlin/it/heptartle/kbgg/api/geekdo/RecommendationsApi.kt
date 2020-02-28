package it.heptartle.kbgg.api.geekdo

import it.heptartle.kbgg.domain.geekdo.Recommendations
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface RecommendationsApi {

    @GET("geekitem/recs")
    fun getRecommendations(@Query("objectid") objectid:Int,
                           @Query("ajax") ajax:Int = 1,
                           @Query("objecttype") objecttype:String = "thing",
                           @Query("pageid") pageId:Int = 1
                           ): Call<Recommendations>
}