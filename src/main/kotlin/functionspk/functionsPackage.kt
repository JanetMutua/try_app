@file:JvmName("FunctionPK")
package functionspk

fun main(args: Array<String>){
    println("Hi!")

    println(displayExpression(4,7))
    println(testMe(status = "Mega")) //named parameters - useful when we have multiple parameters

    //expression function test:

    val testString = " I       am     a      guru  in \t    Kotlin"
    println(testString)
    //helper function
    println(replaceWhiteSpace(testString))
    //expression function
    println(testString.replaceSPacing())
}

//function expressions uses the if statement as an expression
fun displayExpression(num1:Int, num2:Int):Int = if ( num1> num2) num1 else num2


// default function and using an annotation for java files
@JvmOverloads
fun testMe(status: String, education:String = "Masters"):Boolean{
    println("I am a $status woman and I have a $education")
    return true
}

//extension functions - added to the String class
fun String.replaceSPacing():String{
    var regex = Regex("\\s+")
    return regex.replace(this, " ")
}
//helper function
fun replaceWhiteSpace(value: String):String{
    var regex = Regex("\\s+")
    return regex.replace(value, " ")
}