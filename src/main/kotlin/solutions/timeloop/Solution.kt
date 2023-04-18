package solutions.timeloop

fun main() {
    val input = readln().toInt()
    solve(input)
}

fun solve(lastNumber: Int) = (1..lastNumber).forEach { n -> println("$n Abracadabra") }
