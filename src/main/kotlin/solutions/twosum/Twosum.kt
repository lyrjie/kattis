package solutions.twosum

fun main() {
    val input = readln().trim().split(" ").map { it.toInt() }
    val (first, second) = input
    println(solve(first, second))
}

fun solve(first: Int, second: Int) = first + second
