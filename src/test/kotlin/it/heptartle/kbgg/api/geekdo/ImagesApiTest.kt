package it.heptartle.kbgg.api.geekdo

import it.heptartle.kbgg.factory.GeekdoServiceFactory
import org.junit.jupiter.api.Assertions.assertEquals

class ImagesApiTest {

    private val service = GeekdoServiceFactory.getImageService()

    @org.junit.jupiter.api.Test
    fun retrieveImage() {

        val response = service.getImages(177736, pageid = 1, showcount = 1).execute().body()
        checkNotNull(response)
        assertEquals(1, response.images.size)
    }
}