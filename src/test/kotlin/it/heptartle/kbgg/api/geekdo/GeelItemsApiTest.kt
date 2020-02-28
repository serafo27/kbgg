package it.heptartle.kbgg.api.geekdo

import it.heptartle.kbgg.domain.geekdo.ObjectType
import it.heptartle.kbgg.factory.GeekdoServiceFactory
import org.junit.jupiter.api.Assertions.assertEquals

class GeelItemsApiTest {

    private val service = GeekdoServiceFactory.getGeekItemsApi()

    @org.junit.jupiter.api.Test
    fun retrieveFiles() {

        val response = service.getGeekItem(35585, ObjectType.person).execute().body()
        checkNotNull(response)
    }
}