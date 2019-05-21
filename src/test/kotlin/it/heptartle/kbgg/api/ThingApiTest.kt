package it.heptartle.kbgg.api

import it.heptartle.kbgg.domain.Name
import it.heptartle.kbgg.domain.Thumbnail
import it.heptartle.kbgg.domain.YearPublished
import it.heptartle.kbgg.factory.ServiceFactory
import org.junit.jupiter.api.Test

class ThingApiTest {

    private val service = ServiceFactory.getThingService()

    @Test
    fun retrieveThing() {
        val response = service.getThing(245934).execute().body()
        checkNotNull(response)
    }


    private fun getName(): Name {
        val name = Name()
        name.value = "The Lord of the Rings: Journeys in Middle-earth"
        return name
    }

    private fun getThumbnail(): Thumbnail {
        val thumbnail = Thumbnail()
        thumbnail.value =
            "https://cf.geekdo-images.com/thumb/img/lC2ZZuxY2B7koN8mtrSmsszW4QA=/fit-in/200x150/pic4530974.jpg"
        return thumbnail
    }

    private fun getYearPublished(): YearPublished {
        val yearPublished = YearPublished()
        yearPublished.value = "2019"
        return yearPublished
    }
}