package org.example

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import kotlin.test.assertContains

class AppTest {
    @Test
    @DisplayName("명언 작성")
    fun t1() {
        val result = TestRunner.run(
            """
            등록
            나의 죽음을 적에게 알리지 말라.
            충무공 이순신
            """.trimIndent()
        )

        assertContains(result, "명언 : ")
        assertContains(result, "작가 : ")
        assertContains(result, "1번 명언이 등록되었습니다.")
    }
}