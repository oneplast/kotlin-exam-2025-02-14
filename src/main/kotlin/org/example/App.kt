package org.example

import org.example.domain.system.system.controller.SystemController
import org.example.domain.wiseSaying.wiseSaying.controller.WiseSayingController
import org.example.domain.wiseSaying.wiseSaying.entity.WiseSaying

class App {
    fun run() {
        val wiseSayingController = WiseSayingController()
        val systemController = SystemController()

        println("== 명언 앱 ==")

        while (true) {
            print("명령) ")

            // !! -> Nullable(false)
            val input = readlnOrNull()!!.trim()

            val rq = Rq(input)

            when (rq.action) {
                "종료" -> {
                    systemController.actionExit(rq)
                    break
                }

                "등록" -> wiseSayingController.actionWrite(rq)
                "목록" -> wiseSayingController.actionList(rq)
                "삭제" -> wiseSayingController.actionDelete(rq)
            }
        }
    }
}