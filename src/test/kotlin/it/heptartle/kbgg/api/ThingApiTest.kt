package it.heptartle.kbgg.api

import it.heptartle.kbgg.factory.ServiceFactory
import org.junit.jupiter.api.Test

class ThingApiTest {

    private val service = ServiceFactory.getThingService()

    @Test
    fun retrieveThing() {
        val response = service.getThing(245934).execute().body()
        checkNotNull(response)
    }

    @Test
    fun retrieveThingWithStatistics() {
        val response = service.getThing(245934, 1).execute().body()
        checkNotNull(response)
    }

}