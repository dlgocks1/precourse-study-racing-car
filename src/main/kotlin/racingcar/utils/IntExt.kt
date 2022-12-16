package racingcar.utils

fun Int.addResults(): String {
    val results = StringBuilder()
    for (idx in 1..this) {
        results.append("-")
        if (idx == this) continue
        results.append(" ")
    }
    return results.toString()
}