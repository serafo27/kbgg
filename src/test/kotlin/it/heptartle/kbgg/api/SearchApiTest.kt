package it.heptartle.kbgg.api

import it.heptartle.kbgg.domain.Type
import it.heptartle.kbgg.factory.ServiceFactory
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotEquals
import org.junit.jupiter.api.Test

class SearchApiTest {

    private val service = ServiceFactory.getSearchService()

    @Test
    fun name() {

        val response = service.search("a feast for odin").execute().body()
        checkNotNull(response)
        assertEquals(7, response.total)
        assertNotEquals(0, response.items)
        assertEquals(177736, response.items!![0].id)
        assertEquals("A Feast for Odin", response.items!![0].names!![0].value)
        assertEquals(null, response.items!![0].rank)
        assertEquals(Type.BOARDGAME.value, response.items!![0].type)
        assertEquals(null, response.items!![0].thumbnail)
        assertEquals("2016", response.items!![0].yearpublished)
    }

}