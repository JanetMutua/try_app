@file:JvmName("InfixFunctions")

package functionspk

fun main(args: Array<String>){

    val h1 = Header("H1")
    val h2 = Header("H2")

    //extension function
    val h5 = h1.plus(h2)

    //infix function (eliminates the dot and bracket notations)
    val h3 = h1 plus h2

    println(h3.Name)

    //operator overloading
    val h4 = h1 + h2
    println(h4.Name)

}

class Header(var Name:String){}

//extending the Header class using an infix function
//operator overloading using operator modifier
//works as both an infix and an operator overload

infix operator fun Header.plus(other:Header):Header{
    return Header(this.Name + other.Name)
}


