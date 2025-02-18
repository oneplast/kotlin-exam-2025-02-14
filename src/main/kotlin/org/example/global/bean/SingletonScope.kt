package org.example.global.bean

import org.example.domain.system.system.controller.SystemController
import org.example.domain.wiseSaying.wiseSaying.controller.WiseSayingController
import org.example.domain.wiseSaying.wiseSaying.repository.WiseSayingMemoryRepository
import org.example.domain.wiseSaying.wiseSaying.repository.WiseSayingRepository
import org.example.domain.wiseSaying.wiseSaying.service.WiseSayingService

object SingletonScope {
    val wiseSayingController by lazy { WiseSayingController() }
    val wiseSayingService by lazy { WiseSayingService() }
    val wiseSayingRepository: WiseSayingRepository by lazy { WiseSayingMemoryRepository() }
    val systemController by lazy { SystemController() }
}