package com.Janet

class Student (var Name: String, var Age: Int) {
    //concrete method
    fun display(){
        println("Display: $Name and display: $Age")
    }

    //lambda functions
    fun displayLambda(func:(s:String)->Unit){
        func(Name)
    }
}