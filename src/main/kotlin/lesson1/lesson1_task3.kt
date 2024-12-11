package org.example.lesson1

fun main() {

    // variables
    val year: String = "1961"
    var hour: String = "09"
    var minute: String = "07"

    val takeoffTime: String = """
        |$year
        |$hour
        |$minute
    """.trimMargin()

    // output of variables
    println(takeoffTime)

    // change variables
    hour = "10"
    minute = "55"

    // output of the landing time
    println("$hour:$minute")
}