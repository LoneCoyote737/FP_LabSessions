object q2 extends App {
    var a = 2
    var b = 3
    var c = 4
    var d = 5
    var k = 4.3f
    var g = 5.6f

    // pre- and post- increment and decrement operators r not defined in Scala

    b -= 1
    println("(--b)*a+c*(d--) = " + (b*a+c*d))
    d -= 1

    println("a++ = " + a)
    a += 1

    println("-2*(g-k)+c = " + (-2)*(g-k)+c)

    println ("c=c++ = " + c)
    c += 1

    c += 1    
    c *= a
    println ("c=++c*a++ = " + c)
    a += 1

}