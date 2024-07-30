// student record management with Scala tuples

import scala.io.StdIn.*
object Q2 extends App {

    val getStudentInfo = () => {
        println("Enter student's name: ")
        val name = readLine()

        println("Enter marks: ")
        val marks = readInt()

        println("Enter total possible marks: ")
        val possMarks = readInt()

        val studTupleH = (name, marks, possMarks)
        if (validateInput(studTupleH)) {
            val percent = (marks.toDouble / possMarks) * 100
            val grade = findGrade(percent)
            val studTuple = (name, marks, possMarks, percent, grade)
            printStudentRecord(studTuple)
        }
        else getStudentInfoWithRetry(studTupleH)
    }
    val validateInput = (stud: (String, Int, Int)) => 
        if ((stud(0).isEmpty) || (stud(1) < 0) || (stud(2) < 0)) false else true
    val findGrade = (percent: Double) => percent match{
        case x if x >= 90 => 'A'
        case x if x >= 75 => 'B'
        case x if x >= 50 => 'C'
        case x  => 'D'
    }
    val printStudentRecord = (studTuple: (String, Int, Int, Double, Char)) => {
        val (name, marks, possMarks, percent, grade) = studTuple
        
        println(s"\nName: $name\n" +
          s"Marks: $marks\n" +
          s"Total possible marks: $possMarks\n" +
          s"Percentage: $percent\n" +
          s"Grade: $grade")
    }
    val getStudentInfoWithRetry = (stTuple: (String, Int, Int)) => {
        println("Invalid input, please try again!")
        println(stTuple)
        // getStudentInfo()
    }
    
    
    // driver code:
    getStudentInfo()
}
