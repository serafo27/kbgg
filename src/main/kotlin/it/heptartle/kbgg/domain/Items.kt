package it.heptartle.kbgg.domain

import org.simpleframework.xml.Attribute
import org.simpleframework.xml.Element
import org.simpleframework.xml.ElementList
import org.simpleframework.xml.Root

@Root(name = "items")
class Items {
    @field:ElementList(name="item", inline = true, required = false)
    var items: List<Item>? = null

    @field:Attribute
    var termsofuse: String = ""

    @field:Attribute(required = false)
    var total: Int? = null

    override fun toString(): String = "it.heptartle.kbgg.domain.Items(items=$items, termsofuse='$termsofuse', total='$total')"

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Items

        if (items != other.items) return false
        if (termsofuse != other.termsofuse) return false
        if (total != other.total) return false

        return true
    }

    override fun hashCode(): Int {
        var result = items?.hashCode() ?: 0
        result = 31 * result + termsofuse.hashCode()
        result = 31 * result + (total ?: 0)
        return result
    }
}

@Root(name = "item")
class Item {

    @field:Element(required = false)
    var thumbnail: Thumbnail? = null

    @field:Element
    var name: Name = Name()

    @field:Element(required = false)
    var yearpublished: YearPublished? = null

    @field:Attribute
    var id: Int = 0

    @field:Attribute(required = false)
    var type: String? = null

    @field:Attribute(required = false)
    var rank: Int? = null

    override fun toString(): String {
        return "Item(thumbnail=$thumbnail, name=$name, yearpublished=$yearpublished, id=$id, type=$type, rank=$rank)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Item

        if (thumbnail != other.thumbnail) return false
        if (name != other.name) return false
        if (yearpublished != other.yearpublished) return false
        if (id != other.id) return false
        if (type != other.type) return false
        if (rank != other.rank) return false

        return true
    }

    override fun hashCode(): Int {
        var result = thumbnail?.hashCode() ?: 0
        result = 31 * result + name.hashCode()
        result = 31 * result + (yearpublished?.hashCode() ?: 0)
        result = 31 * result + id
        result = 31 * result + (type?.hashCode() ?: 0)
        result = 31 * result + (rank ?: 0)
        return result
    }
}


@Root(name = "name")
class Name {
    @field:Attribute
    var value: String = ""

    @field:Attribute(required = false)
    var type: String? = null

    override fun toString(): String {
        return "Name(value='$value', type=$type)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Name

        if (value != other.value) return false
        if (type != other.type) return false

        return true
    }

    override fun hashCode(): Int {
        var result = value.hashCode()
        result = 31 * result + (type?.hashCode() ?: 0)
        return result
    }
}

@Root(name = "thumbnail")
class Thumbnail {
    @field:Attribute
    var value: String = ""

    override fun toString(): String {
        return "Thumbnail(value='$value')"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Thumbnail

        if (value != other.value) return false

        return true
    }

    override fun hashCode(): Int {
        return value.hashCode()
    }
}

@Root(name = "yearpublished")
class YearPublished {
    @field:Attribute
    var value: String = ""

    override fun toString(): String {
        return "YearPublished(value='$value')"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as YearPublished

        if (value != other.value) return false

        return true
    }

    override fun hashCode(): Int {
        return value.hashCode()
    }
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

