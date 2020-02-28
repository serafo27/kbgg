package it.heptartle.kbgg.api.geekdo

import it.heptartle.kbgg.factory.GeekdoServiceFactory
import org.junit.jupiter.api.Assertions.assertEquals

class ReviewsApiTest {

    private val service = GeekdoServiceFactory.getReviewsService()

    @org.junit.jupiter.api.Test
    fun retrieveReviews() {

        val response = service.getReviews(177736).execute().body()
        checkNotNull(response)
    }
}