package org.example.domain.wiseSaying.wiseSaying.service

import org.example.domain.wiseSaying.wiseSaying.entity.WiseSaying
import org.example.domain.wiseSaying.wiseSaying.repository.WiseSayingRepository
import org.example.global.bean.SingletonScope
import org.example.standard.dto.Page

class WiseSayingService {
    private val wiseSayingRepository = SingletonScope.wiseSayingRepository

    fun write(content: String, author: String): WiseSaying {
        return wiseSayingRepository.save(WiseSaying(content = content, author = author))
    }

    fun isEmpty(): Boolean {
        return wiseSayingRepository.isEmpty()
    }

    fun findAll(): List<WiseSaying> {
        return wiseSayingRepository.findAll()
    }

    fun findAllPaged(itemsPerPage: Int, pageNo: Int): Page<WiseSaying> {
        return wiseSayingRepository.findAllPaged(itemsPerPage, pageNo)
    }

    fun findById(id: Int): WiseSaying? {
        return wiseSayingRepository.findById(id)
    }

    fun delete(wiseSaying: WiseSaying) {
        wiseSayingRepository.delete(wiseSaying)
    }

    fun modify(wiseSaying: WiseSaying, content: String, author: String) {
        wiseSaying.modify(content, author)

        wiseSayingRepository.save(wiseSaying)
    }

    fun build() {
        wiseSayingRepository.build()
    }

    fun findByKeyword(keywordType: String, keyword: String): List<WiseSaying> {
        return when (keywordType) {
            "author" -> wiseSayingRepository.findByAuthorLike("%$keyword%")
            else -> wiseSayingRepository.findByAuthorContent("%$keyword%")
        }
    }

    fun findByKeywordPaged(keywordType: String, keyword: String, itemsPerPage: Int, pageNo: Int): Page<WiseSaying> {
        return wiseSayingRepository.findByKeywordPaged(keywordType, keyword, itemsPerPage, pageNo)
    }
}