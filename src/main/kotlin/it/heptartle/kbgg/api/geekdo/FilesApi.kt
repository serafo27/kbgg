package it.heptartle.kbgg.api.geekdo

import it.heptartle.kbgg.domain.geekdo.Files
import it.heptartle.kbgg.domain.geekdo.Hottest
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface FilesApi {

    @GET("files")
    fun getFile(@Query("objectid") objectid:Int,
                @Query("ajax") ajax:Int = 1,
                @Query("nosession") nosession:Int = 1,
                @Query("objecttype") objecttype:String = "thing",
                @Query("pageid") pageid:Int = 1,
                @Query("sorts[0][showcount]") sortshowncount:Int = 2,
                @Query("sorts[0][sort]") sortshownsort:String = "hot"
                ): Call<Files>
}