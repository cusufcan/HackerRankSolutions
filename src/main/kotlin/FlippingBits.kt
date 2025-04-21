import kotlin.math.pow

fun flippingBits(n: Long): Long {
    var numResult = n
    var twoBased = ""
    while (numResult > 0) {
        twoBased += (numResult % 2).toString()
        numResult = numResult / 2
    }
    twoBased = twoBased.reversed()

    var convertedTwoBased = "0".repeat(32 - twoBased.length)
    convertedTwoBased += twoBased

    var relocatedStr = ""
    for (c in convertedTwoBased) {
        if (c == '1') {
            relocatedStr += '0'
        } else if (c == '0') {
            relocatedStr += '1'
        }
    }

    var sum = 0L
    for (i in relocatedStr.indices) {
        val firstNum = relocatedStr[i].toString().toLong()
        val secondNum = 2.0.pow(relocatedStr.length - i - 1.0)
        sum += (firstNum * secondNum).toLong()
    }
    return sum
}