package it.heptartle.kbgg.domain.geekdo

data class Reviews(val reviews: ReviewCategories,
                   val numitems: NumItems,
                   val showall: ShowAll)

data class ReviewCategories(val hot: List<Review>,
                            val recent: List<Review>)

data class Review(val numrecommend: String,
                  val videoid: String,
                  val postdate: String,
                  val objecttype: String,
                  val objectid: String,
                  val userid: String,
                  val videohost: String,
                  val extvideoid: String,
                  val title: String,
                  val languageid: String,
                  val body: String,
                  val numposts: String,
                  val user: User,
                  val linkname: String,
                  val language: String,
                  val imageurl: String)

data class NumItems(val thread: Int,
                    val video: Int,
                    val total: Int)

data class ShowAll(val forum: String,
                   val video: String)
