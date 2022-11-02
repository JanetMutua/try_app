@file:JvmName("KotlinClasses")

package OOP

fun main(args: Array<String>){
    var implementAccess = Person()
    println(implementAccess.getLoginDetails())
}

open class Person{
    var userName: String = "kara"
    var password: String = "123"

    open fun getLoginDetails():String = "Login details: $userName $password"
}

abstract class Student{
    var studentName: String = ""
    var studentId: String = ""

    abstract fun getStudentDetails():String
}


class SuperUser : Person(){
    override fun getLoginDetails():String{return " "}
}

class StudentMarker: Student(){
    override fun getStudentDetails(): String{return "$studentName: $studentId"}
}

