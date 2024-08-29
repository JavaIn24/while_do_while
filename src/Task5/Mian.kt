package Task5
fun main () {
    var a = 0
    while (a < 20) {
        a+=2
        println(if(a % 4 ==0) 2*a else a)
    }
}
