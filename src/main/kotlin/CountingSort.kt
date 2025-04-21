fun countingSort(arr: Array<Int>): Array<Int> {
    val result = Array(100) { 0 }
    for (num in arr) {
        result[num]++
    }
    return result
}