// Implement a Data Structure for Account and
//         create a method transfer which transfers the money from this account to a given account.
//         Basic functions: Deposit, Withdraw, Transfer

object Q3 extends App {

    class Account (val num: Int) {
        val accNum = num
        var accBalance: Int = 0 // assuming everything is in Int

        def deposit (amt: Int) = {
            this.accBalance = this.accBalance + amt
            println(s"Account number: ${this.accNum} | Amount deposited: $amt\n")
        }

        // commented parts are to prevent balance going to the negative

        def withdraw (amt: Int) = {
            // if (amt < this.accBalance) {
                this.accBalance = this.accBalance - amt
                println(s"Account number: ${this.accNum}\n" +
                        s"Amount withdrawn: $amt | Balance: ${this.accBalance}\n")
            // }
            // else println("Not enough balance in account!\n")
        }
        def transfer (amt: Int, transferee: Account) = {
            // if (amt < this.accBalance) {
                this.accBalance = this.accBalance - amt
                transferee.accBalance = transferee.accBalance + amt
                println(s"Amount transferred: $amt\n" +
                        s"From account: ${this.accNum} | To: ${transferee.accNum}\n" +
                        s"Balance: ${this.accBalance}")
            // }
            // else println("Not enough balance in account!\n")
        }
        override def toString: String = s"Account number: ${this.accNum} | Balance: ${this.accBalance}"
    }

    val acc1 = new Account(123)
    val acc2 = new Account(789)

    acc1.deposit(5000)
    acc1.withdraw(1000)
    acc2.withdraw(2000)
    acc1.transfer(3000, acc2)

}
