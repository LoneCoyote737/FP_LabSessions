object Q5 extends App {
    def countLetterOccurrences (wordList: List[String]) = {
        wordList.map(word => word.length()).reduce(_ + _)
    }

    val myList = List("apple", "banana", "cherry", "date")
    println(s"Total count of letter occurrences: ${{countLetterOccurrences(myList)}}")
}
