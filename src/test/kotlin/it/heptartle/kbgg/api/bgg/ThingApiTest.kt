package it.heptartle.kbgg.api.bgg

import it.heptartle.kbgg.factory.BggServiceFactory
import org.junit.jupiter.api.Test

class ThingApiTest {

    private val service = BggServiceFactory.getThingService()

    @Test
    fun retrieveThing() {
        val response = service.getThing("245934").execute().body()
        checkNotNull(response)
    }

    @Test
    fun retrieveThingWithStatistics() {
        val response = service.getThing("245934", 1).execute().body()
        checkNotNull(response)
    }

    @Test
    fun retrieveThingWithVideos() {
        val response = service.getThing("245934", videos = 1).execute().body()
        checkNotNull(response)
    }

    @Test
    fun retrieveThingWithMarketplace() {
        val response = service.getThing("199561", marketplace = 1).execute().body()
        checkNotNull(response)
    }
}