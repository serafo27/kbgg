package it.heptartle.kbgg.factory

import com.google.gson.GsonBuilder
import it.heptartle.kbgg.api.geekdo.*
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object GeekdoServiceFactory {

    fun getImageService(): ImagesApi =
        geekdoService.create(ImagesApi::class.java)

    fun getHottestService(): HottestApi =
        geekdoService.create(HottestApi::class.java)

    fun getReviewsService(): ReviewsApi =
        geekdoService.create(ReviewsApi::class.java)

    fun getRecommendationsService(): RecommendationsApi =
        geekdoService.create(RecommendationsApi::class.java)

    fun getFilesService(): FilesApi =
        geekdoService.create(FilesApi::class.java)

    fun getGeekItemsApi(): GeekItemsApi =
        geekdoService.create(GeekItemsApi::class.java)

    private val geekdoService: Retrofit =
         Retrofit.Builder()
             .baseUrl("https://api.geekdo.com/api/")
            .client(OkHttpClient())
            .addConverterFactory(GsonConverterFactory.create(
                GsonBuilder()
                    .setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")
                    .create()))
            .build()

}