import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val arr = Array<Int>(10) { 0 }

    for (i in 0 until 10) {
        arr[i] = sc.nextInt()
    }

    val sum = arr[3-1] + arr[5-1] + arr[10-1]
    println(sum)
}