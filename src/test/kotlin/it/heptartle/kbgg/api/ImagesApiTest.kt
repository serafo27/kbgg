package it.heptartle.kbgg.api

import it.heptartle.kbgg.factory.ServiceFactory
import org.junit.jupiter.api.Assertions.assertEquals

class ImagesApiTest {

    private val service = ServiceFactory.getImageService()

    @org.junit.jupiter.api.Test
    fun retrieveImage() {

        val response = service.getImages(177736, pageid = 1, showcount = 1).execute().body()
        checkNotNull(response)
        assertEquals(1, response.images.size)
        assertEquals("A Feast For Odin with my Jarl-sized drinking horn!", response.images[0].caption)
        assertEquals("4753737", response.images[0].imageid)
        assertEquals(
            "https://cf.geekdo-images.com/thumb/img/mS3w8X-1l81uniARy7TaG5CnzZg=/fit-in/200x150/pic4753737.jpg",
            response.images[0].imageurl
        )
        assertEquals(
            "https://cf.geekdo-images.com/large/img/sq7YeZKCQgajrhWg2QovuDcimes=/fit-in/1024x1024/filters:no_upscale()/pic4753737.jpg",
            response.images[0].imageurl_lg
        )
        assertEquals(null, response.images[0].name)
        assertEquals("0", response.images[0].numcomments)
        assertEquals("2", response.images[0].numrecommend)
        assertEquals("1", response.images[0].user.avatar)
        assertEquals("avatar_id135626.jpg", response.images[0].user.avatarfile)
        assertEquals("Razor88", response.images[0].user.username)

    }
}