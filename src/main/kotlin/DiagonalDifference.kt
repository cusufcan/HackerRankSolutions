import kotlin.math.abs

fun diagonalDifference(arr: Array<Array<Int>>): Int {
    var sum1 = 0
    var sum2 = 0
    for (i in arr.indices) {
        sum1 += arr[i][i]
        sum2 += arr[i][arr.size - 1 - i]
    }
    val lastSum = abs(sum1 - sum2)
    return lastSum
}