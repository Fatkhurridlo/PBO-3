import java.util.Scanner

class Test {

    fun add(a: Int, b: Int): Int {
        return a + b
    }
}

fun main(args: Array<String>) {

    var a: Int
    var b: Int
    var s: Int
    val sc = Scanner(System.`in`)

    print("Enter two numbers:")
    a = sc.nextInt()
    b = sc.nextInt()

    var obj = Test()
    s = obj.add(a, b)

    println("The sum is:$s")
}