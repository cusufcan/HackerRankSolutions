fun twoArrays(k: Int, A: Array<Int>, B: Array<Int>): String {
    A.sort()
    B.sortDescending()

    for (i in A.indices) {
        if (A[i] + B[i] < k) {
            return "NO"
        }
    }
    return "YES"
}