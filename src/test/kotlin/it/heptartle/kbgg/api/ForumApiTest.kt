package it.heptartle.kbgg.api

import it.heptartle.kbgg.factory.ServiceFactory
import org.junit.jupiter.api.Test

class ForumApiTest {

    private val service = ServiceFactory.getForumService()

    @Test
    fun retrieveForum() {
        val response = service.getForum(19).execute().body()
        checkNotNull(response)
    }

}