package solutions.sorttwonumbers

fun main() {
    val (first, second) = readln().split(" ").map { it.toInt() }
    if (first <= second) println("$first $second") else println("$second $first")
}
