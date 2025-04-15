fun matchingStrings(strings: Array<String>, queries: Array<String>): Array<Int> {
    val array = Array(queries.count()) { 0 }
    for ((index, value) in queries.withIndex()) {
        var counter = 0
        for (j in strings) {
            if (value == j) counter++
        }
        array[index] = counter
    }
    return array
}