object Q1 extends App {

    // a function to find Greatest Common Divisor (GCD):
    def gcd(a: Int, b: Int): Int = if(b == 0) a else gcd(b, a % b)

    class Rational (n:Int, d:Int) {

        // all rational numbers are simplified here
        val g = gcd(n.abs, d.abs)
        val numer = n/g
        val denom = d/g

        def neg = new Rational(-numer, denom)

        override def toString: String = s"$numer/$denom"
    }

    // Example usage:
    val x = new Rational(3, 4)
    val negX = x.neg
    println(s"Negation of $x: $negX")

    println("Enter a rational number:")
    print("Numerator: ")
    val n1 = scala.io.StdIn.readInt()
    print("Denominator ( != 0 ): ")
    val n2 = scala.io.StdIn.readInt()

    val x2 = new Rational(n1,n2)
    println("Your Rational number: "+ x2)
    println("Its Negation: "+ x2.neg)
}
