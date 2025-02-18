package org.example

import org.example.global.bean.SingletonScope.systemController
import org.example.global.bean.SingletonScope.wiseSayingController
import org.example.global.rq.Rq

class App {
    fun run() {
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
                "수정" -> wiseSayingController.actionModify(rq)
            }
        }
    }
}