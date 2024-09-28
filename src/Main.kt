fun main() {
    println("Введите целое число n: ")
    val n = readLine()?.toIntOrNull()
    println("Введите основание степени x:")
    val x = readLine()?.toIntOrNull()
    // Проверка корректности
    if (n == null || x == null || x <= 1) {
        println("Ошибка: введите корректные значения для n и x (x должен быть > 1).")
        return
    }
    var y = 0
    var power = 1
    while (power < n) {
        y++
        power = Math.pow(x.toDouble(), y.toDouble()).toInt()
    }
    if (power == n) {
        println("Существует целочисленный показатель степени y: $y")
    } else {
        println("Целочисленный показатель не существует")
    }
}