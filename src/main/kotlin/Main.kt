
import it.heptartle.kbgg.factory.BggServiceFactory


fun main() {

    val service = BggServiceFactory.getSearchService()
    val body = service.search("feast for odin").execute().body()
    println(body!!)

//    val geekdoService = ServiceFactory.getImageService()
//    val images = geekdoService.getImages(177736).execute().body()
//    println(images)
}

