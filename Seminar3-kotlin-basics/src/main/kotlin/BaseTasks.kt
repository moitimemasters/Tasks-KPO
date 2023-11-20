import kotlin.math.sqrt

/**
    Задание 1: Функция,спрашивающая у пользователя его ФИО и выводящая его на экране.
    (0.5 балла)
    Формат вывода:
        " Фамилия:
          Имя:
          Отчество:
        "
 */
fun askForInput() {
    print("Введите ваше ФИО: ")
    val fullName = readln().split(" ").toList();
    println("Фамилия: ${fullName[0]}\nИмя: ${fullName[1]}\nОтчество: ${fullName[2]}")
}

/**
    Задание 2: Функция, вычисляющая и возвращающая корни квадратного уравнения. (1 балл)
 */
fun quadraticRoots(a: Double, b: Double, c: Double): Pair<Double, Double> {
    return (-b + sqrt(b * b - 4 * a * c)) / (2 * a) to (-b - sqrt(b * b - 4 * a * c)) / (2 * a)
}

/**
    Задание 3: Вывести на экран трёхзначные десятичные числа s, все цифры которых одинаковы.
    (2 балла)
 */
fun printSameDigitNumbers() {
    for (i in 1..9) {
        println((i * 111).toString())
    }
}

// Используйте эту функцию для запуска кода
// Раскомментируйте нужные участки в процессе реализации
fun main() {
    askForInput()

    val roots = quadraticRoots(-5.0, 4.0, 3.0)
    println("X1 = ${roots.first} ; X2 = ${roots.second}")

    printSameDigitNumbers()
}