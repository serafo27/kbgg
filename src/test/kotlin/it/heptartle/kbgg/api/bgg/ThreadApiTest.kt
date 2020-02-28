package it.heptartle.kbgg.api.bgg

import it.heptartle.kbgg.factory.BggServiceFactory
import org.junit.jupiter.api.Test

class ThreadApiTest {

    private val service = BggServiceFactory.getThreadService()

    @Test
    fun retrieveThread() {
        val response = service.getThread("2224684").execute().body()
        checkNotNull(response)
    }

}