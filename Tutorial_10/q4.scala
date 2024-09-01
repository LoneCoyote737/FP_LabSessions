object Q4 extends App {
    class Account (val accNum: Int, var accBalance: Double) {
        override def toString: String = s"Account number: $accNum | " +
                                        s"Balance: $accBalance"
    }

    var Bank: List[Account] = List(Account(123, -2000), Account(234, 3000))

    def negativeAccounts () = Bank.filter(_.accBalance < 0)
    def sumBalance () = Bank.map(_.accBalance).sum

    def applyInterest (): List[Account] = {
        Bank.map{acc =>
            val newBalance = if (acc.accBalance >= 0) acc.accBalance * 1.05
                            else acc.accBalance * 1.1
            new Account(acc.accNum, newBalance)
        }
    }
    
    for(acc <- Bank) println(acc)

    println("\nNegative accounts:")
    for(acc <- negativeAccounts()) println(acc)

    println(s"\nSum of balances: ${sumBalance()}")

    println("\nAccount balances with interest:")
    for(acc <- applyInterest()) println(acc)
}
