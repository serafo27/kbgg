package it.heptartle.kbgg.api.geekdo

import it.heptartle.kbgg.factory.GeekdoServiceFactory
import org.junit.jupiter.api.Assertions.assertEquals

class FilesApiTest {

    private val service = GeekdoServiceFactory.getFilesService()

    @org.junit.jupiter.api.Test
    fun retrieveFiles() {

        val response = service.getFile(177736).execute().body()
        checkNotNull(response)
    }
}