package it.heptartle.kbgg.api.geekdo

import it.heptartle.kbgg.domain.geekdo.Images
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ImagesApi {

    @GET("images")
    fun getImages(@Query("objectid") thingId:Int,
                  @Query("ajax") ajax:Int = 1,
                  @Query("gallery") gallery:String = "all",
                  @Query("nosession") nosession:Int = 1,
                  @Query("objecttype") objecttype:String = "thing",
                  @Query("pageid") pageid:Int = 1,
                  @Query("showcount") showcount:Int = 50,
                  @Query("size") size:String = "thumb",
                  @Query("sort") sort:String = "recent"
                  ): Call<Images>

}