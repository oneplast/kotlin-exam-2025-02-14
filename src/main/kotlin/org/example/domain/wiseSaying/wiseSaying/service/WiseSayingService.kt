package org.example.domain.wiseSaying.wiseSaying.service

import org.example.domain.wiseSaying.wiseSaying.entity.WiseSaying

class WiseSayingService {
    private var lastId = 0
    private val wiseSayings = mutableListOf<WiseSaying>()

    fun write(content: String, author: String): WiseSaying {
        var id = ++lastId

        return WiseSaying(id, content, author).apply {
            wiseSayings.add(this)
        }
    }

    fun isEmpty(): Boolean {
        return wiseSayings.isEmpty()
    }

    fun findAll(): List<WiseSaying> {
        return wiseSayings
    }

    fun findById(id: Int): WiseSaying? {
        return wiseSayings.find { it.id == id }
    }

    fun delete(wiseSaying: WiseSaying) {
        wiseSayings.remove(wiseSaying)
    }

    fun modify(wiseSaying: WiseSaying, content:String, author:String) {
        wiseSaying.modify(content, author)
    }
}