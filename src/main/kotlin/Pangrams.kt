fun pangrams(s: String): String {
    val changedStr = s.lowercase()
    val strSet = mutableSetOf<Char>()
    for (char in changedStr) {
        strSet.add(char)
    }
    return if (strSet.size == 27) {
        "pangram"
    } else {
        "not pangram"
    }
}