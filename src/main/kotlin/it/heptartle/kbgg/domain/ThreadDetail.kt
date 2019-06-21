package it.heptartle.kbgg.domain

import org.simpleframework.xml.*


@Root(name = "thread")
class ThreadDetail {

    @field:Element
    var articles: Articles = Articles()

    @field:Attribute
    var id : String = ""

    @field:Attribute
    var numarticles : String = ""

    @field:Attribute
    var link : String = ""

    @field:Attribute
    var termsofuse : String = ""

    @field:Text(required = false)
    @field:Path("./subject")
    var subject: String = ""

}

@Root(name = "articles")
class Articles {

    @field:ElementList(name="article", inline = true, required = false)
    var articleList: List<Article>? = null

}

@Root(name = "article")
class Article {

    @field:Attribute
    var id : String = ""

    @field:Attribute
    var username : String = ""

    @field:Attribute
    var link : String = ""

    @field:Attribute
    var postdate : String = ""

    @field:Attribute
    var editdate : String = ""

    @field:Attribute
    var numedits : String = ""

    @field:Text(required = false)
    @field:Path("./subject")
    var subject: String = ""

    @field:Text(required = false)
    @field:Path("./body")
    var body: String = ""

}