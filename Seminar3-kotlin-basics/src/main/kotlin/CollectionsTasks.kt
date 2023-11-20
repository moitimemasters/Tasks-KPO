/**
 *  Задание 1: Заменить все повторяющиеся элементы входного списка на "blahblah".
 *  (1 балл)
 */
fun replaceElements(array: List<String>): List<String> {
    val counter: MutableMap<String, Int> = emptyMap<String, Int>().toMutableMap()
    array.forEach { counter[it] = counter.getOrDefault(it, 0) + 1 }
    return array.map {
        if (counter[it]!! > 1) {
            "blahblah"
        } else {
            it
        }
    }
}


/**
 *  Задание 2: Вернуть количество уникальных слов в строке.
 *  Слова в строке обязательно разделяются пробелом.
 *  (1 балл)
 */
fun uniqueWords(text: String): Int {
    return text.split(" ").distinct().count()
}

// Используйте эту функцию для запуска кода
// Раскомментируйте нужные участки в процессе реализации
fun main() {
    val text = "abc abc cba hello"
    println(uniqueWords(text))

    // Вызвать для text и вывести результат замены на экран
    println(replaceElements(text.split(" ")))
}