package it.heptartle.kbgg.domain.bgg

import org.simpleframework.xml.Attribute
import org.simpleframework.xml.Element
import org.simpleframework.xml.ElementList
import org.simpleframework.xml.Root

@Root(name = "items", strict = false)
class Forum {
    @field:Element
    var threads: Threads =
        Threads()

    @field:Attribute
    var id: String = ""

    @field:Attribute
    var title: String = ""

    @field:Attribute
    var numthreads: String = ""

    @field:Attribute
    var numposts: String = ""

    @field:Attribute
    var lastpostdate: String = ""

    @field:Attribute
    var noposting: String = ""

    @field:Attribute
    var termsofuse: String = ""
}

@Root(name = "threads", strict = false)
class Threads {
    @field:ElementList(name="thread", inline = true, required = false)
    var threadList: List<Thread>? = null
}

@Root(name = "thread", strict = false)
class Thread {
    @field:Attribute
    var id: String = ""

    @field:Attribute
    var subject: String = ""

    @field:Attribute
    var author: String = ""

    @field:Attribute
    var numarticles: String = ""

    @field:Attribute
    var postdate: String = ""

    @field:Attribute
    var lastpostdate: String = ""
}