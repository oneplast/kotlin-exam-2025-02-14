package org.example.domain.wiseSaying.wiseSaying.repository

import org.assertj.core.api.Assertions.assertThat
import org.example.domain.wiseSaying.wiseSaying.entity.WiseSaying
import org.example.global.app.AppConfig
import org.example.global.bean.SingletonScope
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class WiseSayingFileRepositoryTest {
    private val wiseSayingRepository = SingletonScope.wiseSayingFileRepository

    companion object {
        @JvmStatic
        @BeforeAll
        fun beforeAll(): Unit {
            AppConfig.setModeToTest()
        }
    }

    @BeforeEach
    fun setUp() {
        wiseSayingRepository.clear()
    }

    @Test
    fun `save`() {
        val wiseSaying = wiseSayingRepository.save(WiseSaying("나의 죽음을 적들에게 알리지 말라.", "충무공 이순신"))

        val filePath = wiseSayingRepository
            .tableDirPath
            .toFile()
            .listFiles()
            ?.find { it.name == "${wiseSaying.id}.json" }

        assertThat(filePath).isNotNull()
    }
}