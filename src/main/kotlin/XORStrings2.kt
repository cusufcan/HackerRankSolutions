fun stringsXor(s: String, t: String): String {
    val res = StringBuilder()
    for (i in s.indices) {
        res.append(if (s[i] == t[i]) '0' else '1')
    }
    return res.toString()
}