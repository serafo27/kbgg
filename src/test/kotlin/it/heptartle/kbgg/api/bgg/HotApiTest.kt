package it.heptartle.kbgg.api.bgg

import it.heptartle.kbgg.factory.BggServiceFactory
import org.junit.jupiter.api.Test

class HotApiTest {

    private val service = BggServiceFactory.getItemsService()

    @Test
    fun retrieveHotItems() {
        val response = service.hot().execute().body()
        checkNotNull(response)
    }
}