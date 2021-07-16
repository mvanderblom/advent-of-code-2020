import java.io.File
import java.lang.IllegalArgumentException

fun main() {
    val file = File("src/main/resources/input.txt")
    println(fixReport(file))
}

fun fixReport(file: File): Int {
    file.readLines().asSequence()
        .map { it.toInt() }
        .let { allNumbers ->
            allNumbers.flatMap { num ->
                allNumbers.map { otherNum ->
                    num + otherNum to (num to otherNum)
                }
            }
        }
        .find { (sum, _) ->
            sum == 2020
        }
        ?.let { (_, factors) ->
            return factors.first * factors.second
        }
    throw IllegalArgumentException("Input file ${file} doesn't contain numbers that sum to 2020")
}
