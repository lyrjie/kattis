package solutions.triarea

import solutions.twosum.solve

fun main() {
    val input = readln().trim().split(" ").map { it.toInt() }
    val (height, base) = input
    println(solve(height, base))
}

fun solve(height: Int, base: Int) = height.toDouble() * base / 2
