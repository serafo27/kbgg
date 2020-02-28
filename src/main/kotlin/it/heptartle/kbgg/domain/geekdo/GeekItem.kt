package it.heptartle.kbgg.domain.geekdo

data class GeekItem(val item: GeekItemData)

data class GeekItemData(val itemid: Int,
                        val objecttype: String,
                        val objectid: Int,
                        val label: String,
                        val labelpl: String,
                        val href: String,
                        val subtype: String,
                        val subtypes: List<String>,
                        val versioninfo: VersionInfo,
                        val name: String,
                        val alternatename: String,
                        val links: Links,
                        val linkcounts: LinkCounts,
                        val secondarynamescount: Int,
                        val alternatenamescount: Int,
                        val primaryname: Name,
                        val description: String,
                        val wiki: String,
                        val website: Website,
                        val imageid: String,
                        val images: RecommendationImages,
                        val imagepagehref: String,
                        val imageurl: String,
                        val topimageurl: String,
                        val itemstate: String,
                        val promoted_ad: String?,
                        val special_user: SpecialUser)

data class VersionInfo(val kickstarter_widget_url: String?,
                       val gamepageorderurl: String?,
                       val shopifyitem: String?)


data class Links(val boardgamedesigner: List<LinkInfo>?,
                 val boardgameartist: List<LinkInfo>?)

data class LinkInfo(val name: String,
                    val objecttype: String,
                    val objectid: String,
                    val primarylink: Int,
                    val itemstate: String,
                    val href: String)

data class LinkCounts(val boardgamedesigner: Int?,
                      val boardgameartist: Int?)

data class Website(val url: String)

data class SpecialUser(val username: String,
                       val userid: String)