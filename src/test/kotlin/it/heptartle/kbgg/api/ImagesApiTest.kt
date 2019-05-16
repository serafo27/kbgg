package it.heptartle.kbgg.api

import it.heptartle.kbgg.factory.ServiceFactory
import org.junit.jupiter.api.Assertions.assertEquals

class ImagesApiTest {

    private val service = ServiceFactory.getImageService()

    @org.junit.jupiter.api.Test
    fun retrieveImage() {

        val response = service.getImages(177736, pageid = 1, showcount = 1).execute().body()
        checkNotNull(response)
        assertEquals(response.images.size, 1)
        assertEquals(response.images[0].caption, "Korean edition box art")
        assertEquals(response.images[0].imageid, "4736584")
        assertEquals(response.images[0].imageurl, "https://cf.geekdo-images.com/thumb/img/aF6vg1D8pcX5yCA5jwjLVUj3hFo=/fit-in/200x150/pic4736584.png")
        assertEquals(response.images[0].imageurl_lg, "https://cf.geekdo-images.com/large/img/m2BKlMu9c0TufxxNJrelysEsldI=/fit-in/1024x1024/filters:no_upscale()/pic4736584.png")
        assertEquals(response.images[0].name, null)
        assertEquals(response.images[0].numcomments, "0")
        assertEquals(response.images[0].numrecommend, "1")
        assertEquals(response.images[0].user.avatar, "1")
        assertEquals(response.images[0].user.avatarfile, "avatar_id134692.jpg")
        assertEquals(response.images[0].user.username, "JoshYongguk")

    }
}