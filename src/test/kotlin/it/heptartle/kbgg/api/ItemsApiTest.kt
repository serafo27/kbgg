package it.heptartle.kbgg.api

import it.heptartle.kbgg.domain.Name
import it.heptartle.kbgg.domain.Thumbnail
import it.heptartle.kbgg.domain.YearPublished
import it.heptartle.kbgg.factory.ServiceFactory
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotEquals
import org.junit.jupiter.api.Test

class ItemsApiTest {

    private val service = ServiceFactory.getItemsService()

    @Test
    fun retrieveHotItems() {
        val response = service.hot().execute().body()
        checkNotNull(response)
        assertEquals(response.termsofuse, "https://boardgamegeek.com/xmlapi/termsofuse")
        assertEquals(response.total, null)
        assertNotEquals(response.items, 0)
        assertEquals(response.items!![0].id, 269385)
        assertEquals(response.items!![0].name, getName())
        assertEquals(response.items!![0].rank, 1)
        assertEquals(response.items!![0].thumbnail, getThumbnail())
        assertEquals(response.items!![0].type, null)
        assertEquals(response.items!![0].yearpublished, getYearPublished())
    }


    private fun getName(): Name {
        val name = Name()
        name.value = "The Lord of the Rings: Journeys in Middle-earth"
        return name
    }

    private fun getThumbnail(): Thumbnail {
        val thumbnail = Thumbnail()
        thumbnail.value = "https://cf.geekdo-images.com/thumb/img/lC2ZZuxY2B7koN8mtrSmsszW4QA=/fit-in/200x150/pic4530974.jpg"
        return thumbnail
    }

    private fun getYearPublished(): YearPublished {
        val yearPublished = YearPublished()
        yearPublished.value = "2019"
        return yearPublished
    }
}