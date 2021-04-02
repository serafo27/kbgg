package it.heptartle.kbgg.factory

import com.google.gson.GsonBuilder
import it.heptartle.kbgg.api.bgg.*
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object BggLoginServiceFactory {

    fun getLoginService(): LoginApi =
        bggService.create(LoginApi::class.java)

    private val bggService: Retrofit =
        Retrofit.Builder()
            .baseUrl("https://boardgamegeek.com/")
            .client(OkHttpClient())
            .addConverterFactory(
                GsonConverterFactory.create(
                    GsonBuilder()
                        .setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")
                        .create()))
            .build()

}