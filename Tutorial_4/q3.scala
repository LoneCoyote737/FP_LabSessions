// string formatting and such

object Q3 extends App {

    // val toUpper = (word: String) => word.toUpperCase()
    def toUpper (word: String) = word.toUpperCase()
    def toLower (word: String) = word.toLowerCase()
    def formatNames (name: String)(format: String => String) = format(name)

    val names = List("Benny", "Niroshan", "Saman", "Kumara")
    
    println(names)

    println(formatNames(names(0))(toUpper))
    println(s"${names(1).charAt(0)}${formatNames(names(1).charAt(1).toString())(toUpper)}${names(1).substring(2)}")
    println(formatNames(names(2))(toLower))
    println(s"${names(3).substring(0, names(3).length()-1)}${formatNames(names(3).last.toString())(toUpper)}")
}
