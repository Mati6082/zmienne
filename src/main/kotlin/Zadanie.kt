fun silnia(l: Int): Int {
    var wynik = 1
    for (i in 1..l)
        wynik *= i
    return wynik
}

fun maximum(tab: Array<Int>): Int {
    var max = tab[0]
    for (el in tab) {
        if (max < el)
            max = el
    }
    return max
}

fun fibonacci(arg: Int):String {
    val fib = IntArray(arg)
    fib[0] = 1
    fib[1] = 1
    for (i in 2 until arg) {
        fib[i] = fib[i-1] + fib[i-2]
    }
    var wynik = ""
    for (el in fib)
        wynik = "$wynik$el "
    return wynik
}

fun main(args: Array<String>) {
    println(silnia(5))
    val tab = arrayOf(2, 3, 5, 4, 1)
    println(maximum(tab))
    println(fibonacci(10))
}