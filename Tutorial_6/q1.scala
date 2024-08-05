// inventory management with Scala maps

object Q1 extends App {
    case class Product(name: String, quantity: Int, price: Double)

    var inventory1 = Map(
        101 -> Product("Pen", 15, 20),
        273 -> Product("ExerBook", 5, 100),
        274 -> Product("NoteBook", 5, 80)
    )
    var inventory2: Map[Int, Product] = Map(
        101 -> Product("Pen", 5, 20)
    )
    var inventory3: Map[Int, Product] = Map()

    val printDetails = (prod: Product) => println(s"${prod.name}\t${prod.quantity}\t${prod.price}")

    val retrieveNames = (inventory: Map[Int, Product]) => inventory.values.map(_.name).foreach(println)
    val totValue = (inventory: Map[Int, Product]) => inventory.values.map(prod => prod.price * prod.quantity).sum
    val checkIsEmpty = (inventory: Map[Int, Product]) => println(
        inventory.isEmpty match {
            case true => "Inventory is Empty!"
            case x => "Inventory is Not Empty!"
    })

    val max = (a: Double, b: Double) => if(a > b) a else b
    val mergedInventories: Map[Int, Product] = (inventory1.keySet ++ inventory2.keySet).map { id =>
            var j1 = inventory1.getOrElse(id, Product("", 0, 0.0))
            var j2 = inventory2.getOrElse(id, Product("", 0, 0.0))
            val mergedProduct = Product(if (j1.name.isEmpty()) j2.name else j1.name, j1.quantity + j2.quantity, max(j1.price, j2.price))
            id -> mergedProduct
        }.toMap

    val prodIDChecker = (inventory: Map[Int, Product], id: Int) => inventory.get(id) match {
        case None => println("Item does not exist!")
        case Some(p) => printDetails(p)
    }


    println("Items in inventory 1:")
    retrieveNames(inventory1)
    println("")

    println("Total value of inventory 1:")
    println(totValue(inventory1))
    println("")

    checkIsEmpty(inventory1)
    checkIsEmpty(inventory3)
    println("")

    for (p <- mergedInventories.values) printDetails(p)

    prodIDChecker(inventory1, 101)
    prodIDChecker(inventory1, 100)
    println("")

}
