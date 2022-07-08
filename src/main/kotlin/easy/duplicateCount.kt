package easy

fun main() {
    var alreadyExists: MutableList<Char> = ArrayList()
    val textList = "abcAAdEe".toMutableList()
    var count = 0
    textList.forEach { it -> if(textList.count {itList -> itList.lowercaseChar() == it.lowercaseChar()} >= 2 && !alreadyExists.contains(it.lowercaseChar())) {
        count++
        alreadyExists.add(it.lowercaseChar())
    }}
    println(count)
}