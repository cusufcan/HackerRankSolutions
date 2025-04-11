fun miniMaxSum(arr: Array<Int>): Unit {
    var max = arr[0]
    var min = arr[0]
    var sum = 0L

    for (i in arr.indices) {
        when {
            arr[i] > max -> max = arr[i]
            arr[i] < min -> min = arr[i]
        }
        sum += arr[i]
    }

    println("${sum - max} ${sum - min}")
}