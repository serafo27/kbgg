package it.heptartle.kbgg.domain.geekdo

data class Images (val images: List<ImageInfo>,
                   val config: Config
)

data class ImageInfo (val imageid:String,
                      val imageurl_lg: String,
                      val name:String,
                      val caption:String,
                      val numrecommend:String,
                      val numcomments:String,
                      val user: User,
                      val imageurl:String)

data class User (val username:String,
                 val avatar:String,
                 val avatarfile:String,
                 val avatarurl_md:String?,
                 val textreviewcount:Int?,
                 val videoreviewcount:Int?)

data class Config (val sorttypes:List<Prop>,
                   val numitems:Int,
                   val endpage:Int,
                   val galleries:List<Prop>,
                   val categories:List<Prop>,
                   val datefilters:List<Prop>,
                   val filters:List<Prop>)

data class Prop (val type:String,
                 val name:String)