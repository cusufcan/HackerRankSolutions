fun lonelyinteger(a: Array<Int>): Int {
    val countMap = mutableMapOf<Int, Int>()
    for (number in a) {
        countMap[number] = (countMap[number] ?: 0) + 1
    }
    return countMap.entries.first { it.value == 1 }.key
}