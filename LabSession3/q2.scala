// Write a function in Scala that takes a list of strings as input
// and returns a new list containing only the strings that have a length greater than 5.

object q2 {
    def filterBigStrings(strList: List[String]): List[String] = {
        strList.filter(_.length > 5)
    }
    def main(args: Array[String]): Unit = {
        val strList = List("Hello", "Hola", "Ayubowan", "Vanakkam", "Konnichiwa", "Halo", "Priviet")
        println(strList)

        // excludes Hello, Hola and Halo
        val filteredList = filterBigStrings(strList)
        println(filteredList)
    }
}

