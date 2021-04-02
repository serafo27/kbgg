package it.heptartle.kbgg.api.bgg

import it.heptartle.kbgg.domain.bgg.Credentials
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface LoginApi {

    @POST("login/api/v1")
    fun doLogin(@Body credentials: Credentials): Call<Void>
}