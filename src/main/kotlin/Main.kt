package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("== 명언 앱 ==")

    var lastId = 0;

    while (true) {
        print("명령) ")

        // !! -> Nullable(false)
        val input = readlnOrNull()!!.trim()

        if (input == "종료") {
            break
        } else if (input == "등록") {
            print("명언 : ")
            val content = readlnOrNull()!!.trim()
            print("작가 : ")
            val author = readlnOrNull()!!.trim()

            val id = ++lastId
            println("${id}번 명언이 등록되었습니다.")
        }
    }
}