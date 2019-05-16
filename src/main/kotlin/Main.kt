
import it.heptartle.kbgg.factory.ServiceFactory


fun main() {

    val service = ServiceFactory.getSearchService()
    val body = service.search("feast for odin").execute().body()
    println(body!!)

//    val geekdoService = ServiceFactory.getImageService()
//    val images = geekdoService.getImages(177736).execute().body()
//    println(images)
}

