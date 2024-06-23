object q4 {
    // variables to be used:
    var baseTicketPrice = 15    // base value
    var baseAttendees = 120     // base value
    val performanceCost = 500
    val attendeeCost = 3
    val ticketStep = 5
    val attendeeStep = 20;

    val attendeeCostTotal = (count: Int) => count*attendeeCost
    val totalCost = (count: Int) => attendeeCostTotal(count) + performanceCost
    val ticketSale = (count: Int, ticketPrice: Int) => count*ticketPrice
    val calcProfit = (count: Int, ticketPrice: Int) => ticketSale(count, ticketPrice) - totalCost(count)
    
    def main(args: Array[String]): Unit = {
        // a structure to hold relted data
        case class AttendanceVariation(ticketPrice: Int, attendees: Int, profit: Int)

        // make a list of the ticketPrices
        val ticketPrices = (baseTicketPrice - ticketStep*2 to baseTicketPrice + ticketStep*2 by ticketStep).toList

        // make a list of the ticketPrices with their corresponding attendance count and profit made
        val variations = ticketPrices.map { price => 
            val attendees = baseAttendees + ((baseTicketPrice - price) / ticketStep) * attendeeStep
            val profit = calcProfit(price, attendees)
            AttendanceVariation(price, attendees, profit)
        }
        // variations.foreach(println)

        val bestPriceInst = variations.maxBy(_.profit)
        println(s"Best price is ${bestPriceInst.ticketPrice}\n" +
                s"When ${bestPriceInst.attendees} people attend and\n" +
                s"The total profit made is ${bestPriceInst.profit}")
    }
}
