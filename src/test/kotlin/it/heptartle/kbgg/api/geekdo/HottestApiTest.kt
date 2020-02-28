package it.heptartle.kbgg.api.geekdo

import it.heptartle.kbgg.factory.GeekdoServiceFactory
import org.junit.jupiter.api.Assertions.assertEquals

class HottestApiTest {

    private val service = GeekdoServiceFactory.getHottestService()

    @org.junit.jupiter.api.Test
    fun retrieveHottest() {

        val response = service.getHottest().execute().body()
        checkNotNull(response)
        assertEquals(30, response.items.size)
    }
}