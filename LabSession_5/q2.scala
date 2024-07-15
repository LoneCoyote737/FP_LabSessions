// Library Management System

import scala.io.StdIn.readLine
object Q2 extends App {
    case class Book(title: String, author: String, isbn: String)

    var myLibrary: Set[Book] = Set(
        Book("Harry Potter #1", "J.K.Rowling", "12345"),
        Book("Harry Potter #2", "J.K.Rowling", "23456"),
        Book("The Physician", "Noah Gordon", "34567"),
        Book("Uplift Saga #1", "David Brin", "45678")
    )

    val newBookDetails = () => {
        println("Enter New Book's details:")
        println("Title: ")
        val newTitle = readLine()
        println("Author: ")
        val newAuthor = readLine()
        println("ISBN: ")
        val newISBN = readLine()

        Book(newTitle, newAuthor, newISBN)
    }
    val addBook = () => {myLibrary += newBookDetails(); println("Added book successfully!")}

    val findBookByISBN = (findISBN: String) => myLibrary.find(_.isbn == findISBN)
    val removeBook = (findISBN: String) => findBookByISBN(findISBN) match {
        case Some(book) => {myLibrary -= book; println("Book removed successfully!")}
        case None => println(s"No book found with ISBN: $findISBN")
    }
    
    val checkBook = (findISBN: String) => myLibrary.exists(_.isbn == findISBN)
    val checkBookMsg = (findISBN: String) => if (checkBook(findISBN)) "Book already in Collection" else "Book not in Collection"

    val displayBook = (b: Book) => println(s"${b.title}\t|\t${b.author}\t|\t${b.isbn}")
    val displayLibrary = () => myLibrary.foreach(book => displayBook(book))

    val searchBookByTitle = (searchTitle: String) => myLibrary.find(_.title == searchTitle)
    val showFoundBook = (searchTitle: String) => searchBookByTitle(searchTitle) match {
        case Some(book) => displayBook(book)
        case None => println(s"No book found with Title: $searchTitle")
    }

    val searchByAuthor = (findAuthor: String) => myLibrary.filter(_.author == findAuthor).foreach(book => displayBook(book))

    // driver code:
    displayLibrary()
    
    println("")

    addBook()           // eg: Cradle #1 - Will Wright - 67890
    displayLibrary()
    
    println("")

    // 34567: "The Physician"
    println(checkBookMsg("34567"))
    removeBook("34567")
    removeBook("34567")
    println(checkBookMsg("34567"))
        
    println("")

    displayLibrary()
    
    println("")

    showFoundBook("Uplift Saga #1")
    showFoundBook("The Physician")

    println("")

    searchByAuthor("J.K.Rowling")
}
