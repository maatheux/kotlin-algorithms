package easy

fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
    val score: Array<Int> = arrayOf(0, 0)

    for (i in 0..a.size - 1) {
        when {
            a[i] > b[i] -> score[0] += 1
            a[i] < b[i] -> score[1] += 1
        }
    }

    return score

}

fun main(args: Array<String>) {

    val a = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val b = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = compareTriplets(a, b)

    println(result.joinToString(" "))
}