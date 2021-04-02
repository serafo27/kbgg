package it.heptartle.kbgg.domain.geekdo

data class Recommendations(val recs: List<Recommendation>,
                           val numrecs: Int)

data class Recommendation(
    val description: String,
    val item: RecommendationItem,
    val image: RecommendationImage,
    val topImage: RecommendationImage,
    val rating: Float,
    val rank: Int,
    val yearpublished: String,
    val numfans: Int
)


data class RecommendationItem(
    val type: String,
    val id: String,
    val name: String,
    val href: String,
    val label: String,
    val labelpl: String,
    val hasAngularLink: Boolean,
    val descriptors: List<Descriptors>,
    val imageid: Int,
    val imageSets: ImageSets
)

data class ImageSets(val square100: RecommendationImage)

data class RecommendationImage(val src: String)

data class Descriptors(val name: String,
                       val displayValue: String)

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