package com.yvonne.com.yvonne.score

class Student(/*屬性*/ var name:String , var english:Int, var math:Int) {
    /*屬性(java方式)
    var name = ""
    var english = 0
    var math = 0
     */
    init {
    // println("Testing)
    }

    fun print(){
        //原: println(name + "\t" + english + "\t" + math)
        println("$name\t$english\t$math\t${getAverage()}")
    }

    fun getAverage():Int{
        return (english+math)/2
    }
}

fun main() {
    val student = Student("Jack",80,80)
    student.print()
}