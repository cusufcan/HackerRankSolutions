fun plusMinus(arr: Array<Int>): Unit {
    var posCounter = 0.0
    var zeroCounter = 0.0
    var negCounter = 0.0
    val size = arr.count()

    for (i in arr.indices) {
        when {
            arr[i] < 0 -> negCounter++
            arr[i] > 0 -> posCounter++
            arr[i] == 0 -> zeroCounter++
        }
    }

    println(posCounter / size)
    println(negCounter / size)
    println(zeroCounter / size)
}