object Q2 extends App {
    // a function to find Greatest Common Divisor (GCD):
    def gcd(a: Int, b: Int): Int = if(b == 0) a else gcd(b, a % b)

    class Rational (n:Int, d:Int) {

        // all rational numbers are simplified here
        val g = gcd(n.abs, d.abs)
        val numer = n/g
        val denom = d/g

        def sub(that: Rational) = {
            val newNumer = (this.numer * that.denom) - (that.numer * this.denom)
            val newDenom = this.denom * that.denom
            new Rational(newNumer, newDenom)
        }

        override def toString: String = s"$numer/$denom"
    }

    val x = new Rational(3, 4)
    val y = new Rational(5, 8)
    val z = new Rational(2, 7)

    val result = x.sub(y.sub(z))

    println(s"$x - $y - $z = $result")
    
}
