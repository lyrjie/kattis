package solutions.r2

fun main() {
    val (first, mean) = readln().trim().split(" ").map { it.toInt() }
    println(getSecond(first, mean))
}

fun getSecond(first: Int, mean: Int) = mean + (mean - first)
