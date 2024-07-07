// string formatting and such

object Q3 extends App {

    // val toUpper = (word: String) => word.toUpperCase()
    def toUpper (word: String) = word.toUpperCase()
    def toLower (word: String) = word.toLowerCase()
    def formatNames (name: String)(format: String => String) = format(name)

    val nameList = List("Benny", "Niroshan", "Saman", "Kumara")
    
    println(nameList)
    println(formatNames(nameList(0))(toUpper))

}