package it.heptartle.kbgg.api

import it.heptartle.kbgg.factory.ServiceFactory
import org.junit.jupiter.api.Assertions.assertEquals

class ImagesApiTest {

    private val service = ServiceFactory.getImageService()

    @org.junit.jupiter.api.Test
    fun retrieveImage() {

        val response = service.getImages(177736, pageid = 1, showcount = 1).execute().body()
        checkNotNull(response)
        assertEquals(1, response.images.size)
    }
}