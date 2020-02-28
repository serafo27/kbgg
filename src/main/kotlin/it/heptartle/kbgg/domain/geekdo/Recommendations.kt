package it.heptartle.kbgg.domain.geekdo

data class Recommendations(val recs: List<RecommendationWrap>,
                           val numrecs: Int)

data class RecommendationWrap(val item: RecommendationItem)

data class RecommendationItem(val item: Recommendation)

data class Recommendation(val href: String,
                          val primaryname: Name,
                          val images: RecommendationImages,
                          val dynamicinfo: DynamicInfo)

data class Name(val nameid: String,
                val name: String,
                val sortindex: String,
                val primaryname: String,
                val translit: String)

data class RecommendationImages(val thumb: String,
                                val micro: String,
                                val square: String,
                                val squarefit: String,
                                val tallthumb: String,
                                val previewthumb: String,
                                val square200: String)

data class DynamicInfo(val item: DynamicInfoItem)

data class DynamicInfoItem(val rankinfo: List<RankInfo>,
                           val polls: Polls,
                           val stats: Stats)

data class RankInfo(val prettyname: String,
                    val shortprettyname: String,
                    val veryshortprettyname: String,
                    val subdomain: String,
                    val rankobjecttype: String,
                    val rankobjectid: Int,
                    val rank: String,
                    val baverage: String)

data class Polls(val userplayers: UserPlayers,
                 val playerage: String,
                 val languagedependence: String,
                 val subdomain: String,
                 val boardgameweight: BoardgameWeight)

data class UserPlayers(val best: List<Range>,
                       val recommended: List<Range>,
                       val totalvotes: String)

data class Range(val min: Int,
                 val max: Int)

data class BoardgameWeight(val averageweight: Double,
                           val votes: String)

data class Stats(val usersrated: String,
                 val average: String,
                 val baverage: String,
                 val stddev: String,
                 val avgweight: String,
                 val numweights: String,
                 val numgeeklists: String,
                 val numtrading: String,
                 val numwanting: String,
                 val numwish: String,
                 val numowned: String,
                 val numprevowned: String,
                 val numcomments: String,
                 val numwishlistcomments: String,
                 val numhasparts: String,
                 val numwantparts: String,
                 val views: String,
                 val playmonth: String,
                 val numplays: String,
                 val numplays_month: String,
                 val numfans: Int)