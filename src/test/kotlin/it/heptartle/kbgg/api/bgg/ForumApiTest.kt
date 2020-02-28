package it.heptartle.kbgg.api.bgg

import it.heptartle.kbgg.factory.BggServiceFactory
import org.junit.jupiter.api.Test

class ForumApiTest {

    private val service = BggServiceFactory.getForumService()

    @Test
    fun retrieveForum() {
        val response = service.getForum(19).execute().body()
        checkNotNull(response)
    }

}