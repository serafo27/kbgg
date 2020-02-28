package it.heptartle.kbgg.factory

import it.heptartle.kbgg.api.bgg.*
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.simplexml.SimpleXmlConverterFactory

object BggServiceFactory {

    fun getSearchService(): SearchApi =
        bggService.create(SearchApi::class.java)

    fun getItemsService(): HotApi =
        bggService.create(HotApi::class.java)

    fun getThingService(): ThingApi =
        bggService.create(ThingApi::class.java)

    fun getForumService(): ForumApi =
        bggService.create(ForumApi::class.java)

    fun getThreadService(): ThreadApi =
        bggService.create(ThreadApi::class.java)

    private val bggService: Retrofit =
        Retrofit.Builder()
            .baseUrl("https://www.boardgamegeek.com/xmlapi2/")
            .client(OkHttpClient())
            .addConverterFactory(SimpleXmlConverterFactory.create())
            .build()

}