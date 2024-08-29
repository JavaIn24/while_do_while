package Task4
fun main (){
    var a = 3
    var b = 8
    var c = 0
    while (a <= b) {
        c +=1
        println(a++)
    }
    println("Количество итерации $c")
}