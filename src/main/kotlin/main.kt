import com.Janet.Student

fun main(args: Array<String>){
    println("Hi Janny, love you!!")

    var Janet = Student("Janet", 23)
    println("Name is ${Janet.Name} and Age is ${Janet.Age}")

    Janet.display()

    Janet.displayLambda(::printMyName)
}

fun printMyName(name:String){
    println("My Lambda function states that: I am : $name")
}

