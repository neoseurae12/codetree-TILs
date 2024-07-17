import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val input = sc.nextLine()
    val nums = input.split(" ").map { it.toInt() }
    val sum = nums[3-1] + nums[5-1] + nums[10-1]
    println(sum)
}