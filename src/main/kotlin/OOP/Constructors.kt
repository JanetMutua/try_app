package OOP

//constructors in Kotlin

fun main(args:Array<String>){
    var workerOne = Worker("Janet", 23)

    var myPlant = Monstera("Monstera", 2, "Houseplant", "Clean energy")
    println(myPlant.plantName)

}

//==============preferred method:=======================

class People(val name:String, age: Int= 0)

//============Other methods=============================

class Teacher(_name:String){
    val name = _name
}

class Staff(name:String){
    val name:String
    //use the init function to initialize the variable name
    init {
        this.name = name
    }
}

//secondary constructors; alternative of adding a default constructor

open class Worker(name:String){
    constructor(name: String, age: Int): this(name) //default constructors

}

open class WorkerTwo(name: String, age: Int=0)

//derivation hierarchy of constructors
//calling super class constructors

class Being(name: String): Worker(name)

class Human: Worker{
    constructor(name: String): super(name)
}


//=================================================================================================================
// implementation


open class HousePlant(var plantName: String, var plantAge: Int){
    fun displayName(){
        println("$plantName, $plantAge")
    }
}


class Monstera (plantName: String, plantAge: Int, _plantType:String) : HousePlant(plantName, plantAge){
    var plantType : String
    var plantStrength: String
    init{
        this.plantType = _plantType
        this.plantStrength = ""
    }
    // second constructor
    constructor(plantName: String, plantAge: Int, _plantType:String, plantStrength: String): this(plantName, plantAge, _plantType){
        this.plantStrength = plantStrength
    }



}


