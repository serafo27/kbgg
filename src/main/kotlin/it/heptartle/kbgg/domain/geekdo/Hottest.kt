package it.heptartle.kbgg.domain.geekdo


data class Hottest(val items: List<Item>)

data class Item(val objecttype: String,
                val objectid: String,
                val rep_imageid: String,
                val delta: Int,
                val href: String,
                val name: String,
                val imageurl: String,
                val squareimageurl: String,
                val yearpublished: String,
                val rank: String)