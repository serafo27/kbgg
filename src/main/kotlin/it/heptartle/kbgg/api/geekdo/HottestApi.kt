package it.heptartle.kbgg.api.geekdo

import it.heptartle.kbgg.domain.geekdo.Hottest
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface HottestApi {

    @GET("hotness")
    fun getHottest(@Query("geeksite") thingId:String = "boardgame",
                   @Query("nosession") nosession:Int = 1,
                   @Query("objecttype") objecttype:String = "thing",
                   @Query("showcount") showcount:Int = 30
                   ): Call<Hottest>
}