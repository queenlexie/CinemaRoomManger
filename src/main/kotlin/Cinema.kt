import java.io.File
import java.util.*
import kotlin.io.readLine as readLine

val b0: Byte = 2
val s0: Short = 10
val n0: Int = 5
val l0: Long = 14
val f0: Float = 11.4f

fun mains() {
     println("Cinema:")
        for(i in 1..8)
            print(" $i")
        println()
        for(i in 1..7) {
            print("$i ")
            for (j in 1..8)
                print("S ")
            println()
        }
    }

 fun maina() {
     val scanner = Scanner(System.`in`)
     while(scanner.hasNext())
         println(scanner.next().trim().split(" "))
 }

fun mainss() {
        for (s in readLine()!!.reversed())
            println(s)
}

fun maint() {
    val s = "string"
    print("$s.first()")
    val a = readLine()!!.split(" ")
    val a1= a.get(0)
    val a2= a.get(1)
    val a3= a.get(2)
    print("$a1:$a2:$a3 ")
    val b = readLine()!!.split(" ")
    val b1= b.get(0)
    val b2= b.get(1)
    val b3= b.get(2)
    print("$b1/$b2/$b3")

    val input = readLine()!!.split(" ")
    val name = input.get(0).toCharArray().get(0)
    println()

    println(
        if (true) {
        } else if (false) { "A" } else "B"
    )
}
fun mainx() {
    println("Enter the number of rows:")
    val rows = readLine()!!.toInt()
    println("Enter the number of seats in each row:")
    val seats = readLine()!!.toInt()
    val totalNumberOfSeats :Int = seats*rows
    val totalIncome : Int
    if(totalNumberOfSeats>60)
        totalIncome= totalNumberOfSeats*10


    val size = readLine()!!.toInt()
    var perfect=0
    var larger=0
    var smaller=0
    while(readLine() !=null){
        val input = readLine()!!.toInt()
        if(input> size)
            larger++
        else if(input < size)
            smaller++
        else
            perfect++
    }
    println("$perfect $larger $smaller")

}
fun mainsss() {
    val size = readLine()!!.toInt()
    var perfect=0
    var larger=0
    var smaller=0
    val n = readLine()!!.toInt()

    repeat(n) {
        val input = readLine()!!.toInt()
        if(input> n)
            larger++
        else if(input < n)
            smaller++
        else
            perfect++
        println("$perfect $larger $smaller")
    }
}
fun mainxx() {
    var (As, Bs, Cs, Ds) = listOf(0,0,0,0)
    val n = readLine()!!.toInt()

    repeat(n) {
        val input = readLine()!!.toInt()
        if(input == 5)
            As++
        else if(input==4)
            Bs++
        else if (input == 3)
            Cs++
        else
            Ds++
    }
    println("$Ds $Cs $Bs $As")

    for (i in 'z' downTo 'e' step 200) {}
}
fun composition(value: Int, y: (Int) -> Int, g: (Int) -> Int): Int {
    return y(g(value))
}

fun mainssss() {
    var number: Int = readLine()!!.toInt()
    println(number++)
}

fun main() {
    val fileName = "src/new.txt"
    val linesLength = File(fileName).length()
    val lines = File(fileName).readLines().size
    print("$linesLength $lines")
}



