package it.heptartle.kbgg.api.geekdo

import it.heptartle.kbgg.domain.geekdo.GeekItem
import it.heptartle.kbgg.domain.geekdo.Hottest
import it.heptartle.kbgg.domain.geekdo.ObjectType
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface GeekItemsApi {

    @GET("geekitems")
    fun getGeekItem(@Query("objectid") objectid:Int,
                    @Query("objecttype") objecttype: ObjectType,
                    @Query("nosession") nosession:Int = 1,
                    @Query("ajax") ajax:Int = 1
                    ): Call<GeekItem>
}