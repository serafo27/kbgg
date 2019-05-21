package it.heptartle.kbgg.api

import it.heptartle.kbgg.factory.ServiceFactory
import org.junit.jupiter.api.Test

class ItemsApiTest {

    private val service = ServiceFactory.getItemsService()

    @Test
    fun retrieveHotItems() {
        val response = service.hot().execute().body()
        checkNotNull(response)
    }
}