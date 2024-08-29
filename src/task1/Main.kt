package task1

fun main () {
    println("Введите число")
    var input = readln().toInt()
    var j = 1
    if (input in 0..1) {
        println("Веденное число равно $input, факторил этого числа равен 1")
    }else{
        do {
            j*=input
            input--

        } while (input > 0)
        println("Факториал введенного числа  равен $j")
    }

}