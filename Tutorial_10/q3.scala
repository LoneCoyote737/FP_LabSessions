// Implement a Data Structure for Account and
//         create a method transfer which transfers the money from this account to a given account.
//         Basic functions: Deposit, Withdraw, Transfer

object Q3 extends App {

    class Account (num: Int) {
        val accNum = num
        var accBalance: Int = 0 // assuming everything is in Int

        def deposit (amt: Int) = {
            this.accBalance = this.accBalance + amt
            println(s"Amount deposited: $amt\n")
        }
        def withdraw (amt: Int) = {
            if (amt < this.accBalance) {
                this.accBalance = this.accBalance - amt
                println(s"Amount withdrawn: $amt\n" +
                        s"Remaining balance: ${this.accBalance}\n")
            }
            else println("Not enough balance in account!")
        }
        def transfer (amt: Int, transferee: Account) = {
            if (amt < this.accBalance) {
                this.accBalance = this.accBalance - amt
                transferee.accBalance = transferee.accBalance + amt
                println(s"Amount transferred: $amt\n" +
                  s"To account number: ${transferee.accNum}")
            }
            else println("Not enough balance in account!")
        }
        override def toString: String = s"Account number: ${this.accNum}\nBalance remaining: ${this.accBalance}"
    }

    val acc1 = new Account(123)
    val acc2 = new Account(789)

    acc1.deposit(5000)
    acc1.transfer(3000, acc2)

}
