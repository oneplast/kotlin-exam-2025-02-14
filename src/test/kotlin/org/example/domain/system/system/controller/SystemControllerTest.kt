package org.example.domain.system.system.controller

import org.assertj.core.api.Assertions.assertThat
import org.example.TestRunner
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import kotlin.test.Test

class SystemControllerTest {
    @Test
    @DisplayName("종료")
    fun t1() {
        val result = TestRunner.run("")

        assertThat(result).contains("프로그램을 종료합니다.")
    }
}