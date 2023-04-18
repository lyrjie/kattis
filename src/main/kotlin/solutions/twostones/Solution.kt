package solutions.twostones

fun main() {
    val input = readln().trim().toInt()
    println(solve(input))
}

fun solve(stoneCount: Int): String = if (stoneCount % 2 == 0) "Bob" else "Alice"
