package it.heptartle.kbgg.factory

import it.heptartle.kbgg.api.ImagesApi
import it.heptartle.kbgg.api.ItemsApi
import it.heptartle.kbgg.api.SearchApi
import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.simplexml.SimpleXmlConverterFactory

object ServiceFactory {

    fun getImageService():ImagesApi =
        geekdoService.create(ImagesApi::class.java)

    fun getSearchService():SearchApi =
        bggService.create(SearchApi::class.java)

    fun getItemsService():ItemsApi =
        bggService.create(ItemsApi::class.java)

    private val geekdoService: Retrofit =
         Retrofit.Builder()
            .baseUrl("https://it.heptartle.kbgg.api.geekdo.com/it.heptartle.kbgg.api/")
            .client(OkHttpClient())
            .addConverterFactory(GsonConverterFactory.create(
                GsonBuilder()
                    .setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")
                    .create()))
            .build()

    private val bggService: Retrofit =
        Retrofit.Builder()
            .baseUrl("https://www.boardgamegeek.com/xmlapi2/")
            .client(OkHttpClient())
            .addConverterFactory(SimpleXmlConverterFactory.create())
            .build()

}