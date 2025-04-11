fun timeConversion(s: String): String {
    val time = s.substring(0, 8)
    val timeArray = time.split(":").toMutableList()
    val format = s.substring(8)

    if (timeArray[0] != "12" && format == "PM") {
        timeArray[0] = (timeArray[0].toInt() + 12).toString()
    } else if (timeArray[0] == "12" && format == "AM") {
        timeArray[0] = "00"
    }

    return timeArray.joinToString(separator = ":")
}