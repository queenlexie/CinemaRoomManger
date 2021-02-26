import java.io.File
import java.lang.Double.parseDouble

fun main() {
    println(findLongest("src/main/resources/words_sequence.txt"))
    println(findNumberOfNumbers("src/main/resources/words_with_numbers.txt"))
    println(findLen())
}
fun findLongest(fileName : String) : Int{
    val lines = File(fileName).readLines()
    var longestLength=0
    for (line in lines)
        if(longestLength < line.length)
            longestLength=line.length
    return longestLength
}
fun findNumberOfNumbers(fileName : String) : Int{
    val lines = File(fileName).readLines()
    var numberOfNumbers=0
    for (line in lines)
        try {
            val num = parseDouble(line)
            numberOfNumbers++
        } catch (e: NumberFormatException) {
        }
    return numberOfNumbers
}

fun findLen(){
        val fileName = "src/main/resources/new.txt"
        val linesLength = File(fileName).length()
        val lines = File(fileName).readLines().size
        print("$linesLength $lines")
}