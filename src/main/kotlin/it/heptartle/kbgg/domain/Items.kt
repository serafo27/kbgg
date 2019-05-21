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

    @field:Element(required = false)
    var yearpublished: YearPublished? = null

    @field:Element(required = false)
    var image: Image? = null

    @field:Element(required = false)
    var description: String? = null

    @field:Element(required = false)
    var minplayers: MinPlayers? = null

    @field:Element(required = false)
    var maxplayers: MaxPlayers? = null

    @field:Element(required = false)
    var playingtime: PlayingTime? = null

    @field:Element(required = false)
    var minplaytime: MinPlayTime? = null

    @field:Element(required = false)
    var maxplaytime: MaxPlayTime? = null

    @field:Element(required = false)
    var minage: MinAge? = null

    @field:ElementList(name = "poll", inline = true, required = false)
    var polls: List<Poll>? = null

    @field:ElementList(name = "link", inline = true, required = false)
    var links: List<Link>? = null
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

@Root(name = "minplayes")
class MinPlayers {

    @field:Attribute
    var value: String = ""
}

@Root(name = "maxplayes")
class MaxPlayers {

    @field:Attribute
    var value: String = ""
}

@Root(name = "playingtime")
class PlayingTime {

    @field:Attribute
    var value: String = ""
}

@Root(name = "minplaytime")
class MinPlayTime {

    @field:Attribute
    var value: String = ""
}

@Root(name = "maxplaytime")
class MaxPlayTime {

    @field:Attribute
    var value: String = ""
}

@Root(name = "minage")
class MinAge {

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

@Root(name = "image")
class Image {

    @field:Text
    var text: String = ""
}

@Root(name = "thumbnail")
class Thumbnail {
    @field:Attribute(required = false)
    var value: String? = null

    @field:Text(required = false)
    var text: String? = null
}

@Root(name = "yearpublished")
class YearPublished {
    @field:Attribute
    var value: String = ""
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

