fun birthday(s: Array<Int>, d: Int, m: Int): Int {
    var counter = 0
    for (i in 0..s.count() - m) {
        var sum = 0
        for (j in i..<i + m) {
            sum += s[j]
        }
        if (sum == d) {
            counter++
        }
    }

    return counter
}