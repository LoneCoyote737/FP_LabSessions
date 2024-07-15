// Inventory Management System

import scala.io.StdIn.readLine
object Q1 extends App {
    var productNames: List[String] = List.empty[String]

    val getProductList = () => {
        var input: String = ""
        while ({input = readLine().trim(); input != "done"}) productNames = productNames :+ input
    }
    val printProductList = () => productNames.zipWithIndex.foreach((prod, i) => println(s"${i+1}. $prod"))
    val getTotalProducts = () => productNames.length

    // driver code:
    println("Enter products' names ('done' to finish):")
    getProductList()

    printProductList()
    println(s"Total in inventory: ${getTotalProducts()}")
}