package it.heptartle.kbgg.api

import it.heptartle.kbgg.factory.ServiceFactory
import org.junit.jupiter.api.Test

class ThreadApiTest {

    private val service = ServiceFactory.getThreadService()

    @Test
    fun retrieveThread() {
        val response = service.getThread(2224684).execute().body()
        checkNotNull(response)
    }

}