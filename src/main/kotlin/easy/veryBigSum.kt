package easy

fun aVeryBigSum(ar: Array<Long>): Long = ar.reduce { acc: Long, total: Long -> acc + total }

fun main(args: Array<String>) {
    val arCount = readLine()!!.trim().toInt()

    val ar = readLine()!!.trimEnd().split(" ").map{ it.toLong() }.toTypedArray()

    val result = aVeryBigSum(ar)

    println(result)
}