import java.util.Scanner
object q3 {
    val scanner = new Scanner(System.in)

    val normalSalary = (hours: Int) => hours*250
    val otSalary = (hours: Int) => hours*85
    val totSalary = (nHours: Int, otHours: Int) => normalSalary(nHours) + otSalary(otHours)
    val netSalary = (totSal: Double) => totSal*0.88
    
    def main(args: Array[String]): Unit = {
        println("Enter employee's working hours: ")
        val normalH: Int = scanner.nextInt()
        println("Enter employee's OT hours: ")
        val otH: Int = scanner.nextInt()

        val netSal = netSalary(totSalary(normalH, otH))
        println("Total take home salary: " + netSal)
    }
}