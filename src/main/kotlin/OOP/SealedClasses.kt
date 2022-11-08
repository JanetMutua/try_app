@file:JvmName("Sealed Classes")

package OOP

fun main(args: Array<String>){
    testTrainAi(trainAI.visualAI())
    testTrainAi(trainAI.timerAI())
    testTrainAi((trainAI.deepLearning("2.0")))
}

// does not require an else statement in the when conditional because the expected results are known
// restricts the type hierarchy
sealed class trainAI{
    class visualAI : trainAI()
    class timerAI : trainAI()
    class deepLearning(val timer: String): trainAI()
}


fun testTrainAi(version : trainAI){
    when(version){
        is trainAI.visualAI -> println("This is a visual AI")
        is trainAI.timerAI -> println("This is a timer AI")
        is trainAI.deepLearning -> println(version.timer)
    }

}
