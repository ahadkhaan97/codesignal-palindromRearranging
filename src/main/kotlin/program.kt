fun main() {
    print(solution("abba"))
}

fun solution(s: String): Boolean {
    val map = HashMap<Char, Int>()
    s.forEach {
        if (map[it] == null) {
            map[it] = 1
        } else {
            map[it] = map[it]!! + 1
        }
    }

    var oneOdd = false

    map.forEach {
        if (it.value % 2 != 0) {
            if (!oneOdd)
                oneOdd = true
            else
                return false
        }
    }

    return true
}
