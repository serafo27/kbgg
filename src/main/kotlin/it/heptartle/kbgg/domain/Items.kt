package it.heptartle.kbgg.domain

import org.simpleframework.xml.*

@Root(name = "items")
class Items {
    @field:ElementList(name="item", inline = true, required = false)
    var items: List<Item>? = null

    @field:Attribute
    var termsofuse: String = ""

    @field:Attribute(required = false)
    var total: Int? = null
}

@Root(name = "item")
class Item {

    @field:Attribute
    var id: Int = 0

    @field:Attribute(required = false)
    var type: String? = null

    @field:Attribute(required = false)
    var rank: Int? = null

    @field:Element(required = false)
    var thumbnail: Thumbnail? = null

    @field:ElementList(name = "name", inline = true, required = false)
    var names: List<Name>? = null

    @field:Attribute(name="value", required = false)
    @field:Path("./yearpublished")
    var yearpublished: String? = null

    @field:Text(required = false)
    @field:Path("./image")
    var image: String? = null

    @field:Element(required = false)
    var description: String? = null

    @field:Attribute(name = "value", required = false)
    @field:Path("./minplayers")
    var minplayers: Int? = null

    @field:Attribute(name="value", required = false)
    @field:Path("./maxplayers")
    var maxplayers: Int? = null

    @field:Attribute(name="value", required = false)
    @field:Path("./playingtime")
    var playingtime: Int? = null

    @field:Attribute(name="value", required = false)
    @field:Path("./minplaytime")
    var minplaytime: Int? = null

    @field:Attribute(name="value", required = false)
    @field:Path("./maxplaytime")
    var maxplaytime: Int? = null

    @field:Attribute(name="value", required = false)
    @field:Path("./minage")
    var minage: Int? = null

    @field:ElementList(name = "poll", inline = true, required = false)
    var polls: List<Poll>? = null

    @field:ElementList(name = "link", inline = true, required = false)
    var links: List<Link>? = null

    @field:Element(required = false)
    var videos: Videos? = null

    @field:Element(required = false)
    var statistics: Statistics? = null

}

@Root(name = "videos")
class Videos {

    @field:ElementList(name = "video", inline = true, required = false)
    var videoList: List<Video>? = null

    @field:Attribute
    var total: Int = 0
}

@Root(name = "video")
class Video {

    @field:Attribute
    var id: Int = 0

    @field:Attribute
    var title: String = ""

    @field:Attribute
    var category: String = ""

    @field:Attribute
    var language: String = ""

    @field:Attribute
    var link: String = ""

    @field:Attribute
    var username: String = ""

    @field:Attribute
    var userid: Int = 0

    @field:Attribute
    var postdate: String = ""
}

@Root(name = "statistics")
class Statistics {

    @field:Attribute
    var page: Int  = 0

    @field:Element
    var ratings: Ratings = Ratings()
}

@Root(name = "ratings")
class Ratings {

    @field:Attribute(name = "value")
    @field:Path("./usersrated")
    var usersrated: String = ""

    @field:Attribute(name = "value")
    @field:Path("./average")
    var average: String = ""

    @field:Attribute(name = "value")
    @field:Path("./bayesaverage")
    var bayesaverage: String = ""

    @field:Attribute(name = "value")
    @field:Path("./stddev")
    var stddev: String = ""

    @field:Attribute(name = "value")
    @field:Path("./median")
    var median: String = ""

    @field:Attribute(name = "value")
    @field:Path("./owned")
    var owned: String = ""

    @field:Attribute(name = "value")
    @field:Path("./trading")
    var trading: String = ""

    @field:Attribute(name = "value")
    @field:Path("./wanting")
    var wanting: String = ""

    @field:Attribute(name = "value")
    @field:Path("./wishing")
    var wishing: String = ""

    @field:Attribute(name = "value")
    @field:Path("./numcomments")
    var numcomments: String = ""

    @field:Attribute(name = "value")
    @field:Path("./numweights")
    var numweights: String = ""

    @field:Attribute(name = "value")
    @field:Path("./averageweight")
    var averageweight: String = ""

    @field:Element
    var ranks: Ranks = Ranks()
}

@Root(name = "ranks")
class Ranks {

    @field:ElementList(name = "ranks", inline = true, required = false)
    var rankList: List<Rank>? = null
}

@Root(name = "rank")
class Rank {

    @field:Attribute
    var type: String = ""

    @field:Attribute
    var id: Int = 0

    @field:Attribute
    var name: String = ""

    @field:Attribute
    var friendlyname: String = ""

    @field:Attribute
    var value: Int = 0

    @field:Attribute
    var bayesaverage: String = ""
}


@Root(name = "link")
class Link {

    @field:Attribute
    var type: String = ""

    @field:Attribute
    var id: Int = 0

    @field:Attribute
    var value: String = ""
}


@Root(name = "poll")
class Poll {

    @field:Attribute
    var name: String = ""

    @field:Attribute
    var title: String = ""

    @field:Attribute
    var totalvotes: Int = 0

    @field:ElementList(name = "results", inline = true, required = false)
    var resultsList: List<Results>? = null
}

@Root(name = "results")
class Results {

    @field:Attribute(required = false)
    var numplayers: String? = null

    @field:ElementList(name = "result", inline = true, required = false)
    var results: List<Result>? = null

}

@Root(name = "result")
class Result {

    @field:Attribute
    var value: String = ""

    @field:Attribute
    var numvotes: Int = 0

    @field:Attribute(required = false)
    var level: Int? = null
}


@Root(name = "name")
class Name {
    @field:Attribute
    var value: String = ""

    @field:Attribute(required = false)
    var type: String? = null

    @field:Attribute(required = false)
    var sortindex: String? = null

}


@Root(name = "thumbnail")
class Thumbnail {
    @field:Attribute(required = false)
    var value: String? = null

    @field:Text(required = false)
    var text: String? = null
}


enum class Type(val value: String) {
    BOARDGAME("boardgame"),
    RPG("rpg"),
    VIDEOGAME("videogame"),
    BOARDGAMEPERSON("boardgameperson"),
    RPGPERSON("rpgperson"),
    BOARDGAMECOMPANY("boardgamecompany"),
    RPGCOMPANY("rpgcompany"),
    VIDEOGAMECOMPANY("videogamecompany");

    override fun toString(): String{
        return value
    }
}

enum class ExactResult(val value:Int?) {
    TRUE(1),
    FALSE(null)
}

