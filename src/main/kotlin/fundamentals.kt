import java.io.FileReader
import java.io.IOException
import java.lang.NumberFormatException
import java.util.TreeMap

fun main(){
    println("Hello winner!!")
    //--------------------------------------------------
    // safe operator and null checks

    var q:Question? = Question()
    q?.Answer = "Snuggled in a car"
    println("${q?.Question}: ${q?.Answer}")
    //Adding null tests
    var message:String? = null

    //--------------------------------------------------
    //if statements are expressions hence assigned to the variable

    message = if (q?.Answer == q?.correctAnswer){

        "You are correct"
    }else{
        "Answer not correct: Try again"
    }
    println(message)

    //--------------------------------------------------
    //try catch statements

    var number:Int? = try {
        Integer.parseInt(q?.Answer)
    }catch (e:NumberFormatException){
        null
    }
    println("Is the answer a number? $number")



    //=================================================================================================
    var gamer = Game()
    gamer.playerOne = "twocase"
    gamer.testGame()

    //-----------------------------------------------
    //try catch statement

    var testNumber:Int? = try {
        Integer.parseInt(q?.Answer)
    }catch (e:NumberFormatException){
        null
    }

    println("Gamer said a number? $testNumber")

    //====================================================================================================

    //Looping constructs

    //downTo, step, until

    for (i in 1 until 10 step 2){
        println(i)
    }

    //Looping a list

    var numbersList = listOf(1, 34, 45,2)

    for (i in numbersList){
        println(i)
    }

    //Looping a map = similar to dictionary in python

    var mapPeople = TreeMap<String, Int>()

    mapPeople["Janet"] = 23
    mapPeople["Loise"] = 22
    mapPeople["Arnold"] = 34

    for ((person, age) in mapPeople){
        println("$person is $age years old")
    }

    //looping while showing indexes

    for ((index, element) in numbersList.withIndex()){
        println("$index - $element")
    }

    //=======================================================================================================

    //simplifying exceptions

}
//============================================================================================================
class Question(){
    var Answer:String = ""
    val correctAnswer: String = "Smoked"
    val Question:String = "Never have I ever"

}
//==============================================================================================================
class Game(){
    var playerOne:String = ""
    val answer:String = "twocase"
    val playerTwo:String = "PC1"

    fun testGame(){

        //when statement replaces if statement
        when(playerOne){
            answer -> println("You are a guru")
            else -> println("You just lost")
        }
    }
}

