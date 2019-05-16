package it.heptartle.kbgg.api

import it.heptartle.kbgg.domain.Name
import it.heptartle.kbgg.domain.Type
import it.heptartle.kbgg.domain.YearPublished
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
        assertEquals(response.total, 7)
        assertNotEquals(response.items, 0)
        assertEquals(response.items!![0].id, 177736)
        assertEquals(response.items!![0].name, getName())
        assertEquals(response.items!![0].rank, null)
        assertEquals(response.items!![0].type, Type.BOARDGAME.value)
        assertEquals(response.items!![0].thumbnail, null)
        assertEquals(response.items!![0].yearpublished, getYearPublished())
    }


    private fun getName(): Name {
        val name = Name()
        name.value = "A Feast for Odin"
        name.type = "primary"
        return name
    }

    private fun getYearPublished(): YearPublished {
        val yearPublished = YearPublished()
        yearPublished.value = "2016"
        return yearPublished
    }
}