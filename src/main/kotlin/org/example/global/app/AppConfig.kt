package org.example.global.app

import java.nio.file.Path

object AppConfig {
    private var mode = "dev"

    fun setModeToTest() {
        mode = "test"
    }

    fun setModeToDev() {
        mode = "dev"
    }

    val dbDirPath: Path
        get() = Path.of("data/db/${mode}")
}