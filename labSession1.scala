object LabSession1 {
    // q1:
    val Pi: Double = 3.14
    val diskArea = (r: Double) => Pi*r*r;

    // q2:
    def toFahrenheit(temp: Int): Double = temp*1.8+32

    // q3:
    def sphereVolume(r: Double): Double = 4/3*Pi*r*r*r

    // q4:
    val bookPrice = 24.95
    def coverCost(n:Int): Double = n*bookPrice
    def discountedPrice(n: Int): Double = coverCost(n)*(1-0.4)
    def shippingCost(n: Int): Double = if(n>50) (n-50)*0.75+(50*3) else n*3
    def finalCost(n: Int): Double = discountedPrice(n) + shippingCost(n)

    // q5:
    val easyPace = (dist: Int) => dist*8
    val tempoPace = (dist: Int) => dist*7

    def main(args: Array[String]): Unit = {

        val radius : Int = 5
        println("Area of disk: " + diskArea(radius))

        val cTemp = 35
        println("Temperature in Fahrenheit: " + toFahrenheit(cTemp))

        println("Volume of sphere: " + sphereVolume(radius))

        val n = 60
        println("Wholesale book cost: " + finalCost(n))

        println("Total running time: " + (easyPace(2) + tempoPace(3) + easyPace(2)) + " minutes")
    }
}
