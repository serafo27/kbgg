package it.heptartle.kbgg.api.geekdo

import it.heptartle.kbgg.factory.GeekdoServiceFactory
import org.junit.jupiter.api.Assertions.assertEquals

class RecommendationsApiTest {

    private val service = GeekdoServiceFactory.getRecommendationsService()

    @org.junit.jupiter.api.Test
    fun retrieveRecommendations() {

        val response = service.getRecommendations(291572).execute().body()
        checkNotNull(response)
    }
}