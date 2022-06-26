fun main(args: Array<String>) {
//    val arCount = readLine()!!.trim().toInt()

    val ar = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = simpleArraySum(ar)

    println(result)
}

fun simpleArraySum(ar: Array<Int>): Int = ar.reduce {acc, num -> acc + num }

//fun simpleArraySum(ar: Array<Int>): Int {
//    var sum = 0
//    for (i in ar) {
//        sum += i
//    }
//    return sum
//}
