package solutions.qaly

data class Period(
    val quality: Float,
    val lengthYears: Float,
) {
    val adjustedLengthYears: Float
        get() = quality * lengthYears
}

fun main() {
    val inputCount = readln().toInt()
    val input = List(inputCount) {
        val (quality, lengthYears) = readln().split(" ").map { it.toFloat() }
        Period(quality, lengthYears)
    }
    println(solve(input))
}

fun solve(input: List<Period>) =
    input.fold(0.0f) { total, period -> total + period.adjustedLengthYears }
