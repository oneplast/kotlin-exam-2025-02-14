package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("== 명언 앱 ==")

    while (true) {
        print("명령) ")

        var input = readlnOrNull()

        if (input == "종료") {
            break
        }
    }
}