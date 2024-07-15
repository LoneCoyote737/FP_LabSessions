object Q3 extends App {
    def fibonacci(n: Int): Int = {
        if (n <= 0) 0
        else if (n == 1) 1
        else fibonacci(n - 1) + fibonacci(n - 2)
    }

    for (i <- 1 to 5) print(fibonacci(i) + " ")
    println("")
    for (i <- 1 to 8) print(fibonacci(i) + " ")

}