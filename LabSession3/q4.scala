// Write a function in Scala that takes a list of integers as input
// and returns the sum of all the even numbers in the list

object q4 {
    def sumEvens(intList: List[Int]): Int = {
        var sum: Int = 0
        intList.foreach(x => {
            if(x % 2 == 0) sum += x
        })
        sum
    }

    def main(args: Array[String]): Unit = { 
        val myList = List(1,2,3,4,5,6,7,8,9)
        val evenSum = sumEvens(myList)
        println(evenSum)
    }
}
