fun main() {
    time { println("Fibo1: ${fibo1(45)}") }
    time { println("Fibo2: ${fibo2(45)}") }
}

fun time(func: () -> Unit): Long {
    val start = System.nanoTime()
    func.invoke()
    return (System.nanoTime() - start).apply {
        println("Time: $this ns")
    }
}