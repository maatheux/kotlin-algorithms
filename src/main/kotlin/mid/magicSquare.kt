fun main() {
    val s = Array<Array<Int>>(3, { Array<Int>(3, { 0 }) })

    for (i in 0 until 3) {
        s[i] = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    }

    val result = formingMagicSquare(s)

    println(result)
}

fun formingMagicSquare(s: Array<Array<Int>>): Int {

    var minTotalCost = Int.MAX_VALUE

    val squareWays = listOf(
        listOf(listOf(8, 1, 6), listOf(3, 5, 7), listOf(4, 9, 2)),
        listOf(listOf(6, 1, 8), listOf(7, 5, 3), listOf(2, 9, 4)),
        listOf(listOf(2, 7, 6), listOf(9, 5, 1), listOf(4, 3, 8)),
        listOf(listOf(4, 3, 8), listOf(9, 5, 1), listOf(2, 7, 6)),
        listOf(listOf(2, 9, 4), listOf(7, 5, 3), listOf(6, 1, 8)),
        listOf(listOf(4, 9, 2), listOf(3, 5, 7), listOf(8, 1, 6)),
        listOf(listOf(8, 3, 4), listOf(1, 5, 9), listOf(6, 7, 2)),
        listOf(listOf(6, 7, 2), listOf(1, 5, 9), listOf(8, 3, 4))
    )

    for (way in squareWays) {
        var currentMinTotalCost = 0
        for (i in 0..way.size - 1) {
            for (j in 0..way[i].size - 1) {
                currentMinTotalCost += Math.abs(way[i][j] - s[i][j])
            }
        }
        if (currentMinTotalCost < minTotalCost) {
            minTotalCost = currentMinTotalCost
        }
    }

    return minTotalCost

}