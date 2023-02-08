
// O(e^n)
fun fibo1(n: Int): Int {
    if(n == 0) return 0
    if(n == 1) return 1
    return fibo1(n-1) + fibo1(n-2)
}

// O(n)
private val saved = Array(10000) { -1 }
fun fibo2(n: Int): Int {
    if(n == 0) return 0
    if(n == 1) return 1
    if(saved[n] != -1) return saved[n]
    return (fibo2(n-1) + fibo2(n-2)).apply {
        saved[n] = this
    }
}