fun main() {
    val inputString = "AAADSSRRTTHAAAA" // Вместо этого можно запросить ввод у пользователя через readLine()

    var result = ""
    var count = 1

    for (i in 0 until inputString.length - 1) {
        if (inputString[i] == inputString[i + 1]) {
            count++
        } else {
            if (count > 1) {
                result += "${inputString[i]}$count"
            } else {
                result += "${inputString[i]}"
            }
            count = 1
        }
    }

// Обработка последнего символа
    if (count > 1) {
        result += "${inputString[inputString.length - 1]}$count"
    } else {
        result += "${inputString[inputString.length - 1]}"
    }

    println(result)
}


