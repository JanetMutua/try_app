package OOP

// data classes
//overrides the equals, hashcode and toString methods
//makes the classes immutable
// object values can be copied

fun main(args: Array<String>){
    var companyOne = Company("Safaricom", "Westlands, Nairobi")
    var companyTwo = Company("Safaricom", "Westlands, Nairobi")

    println(companyOne)

    if(companyOne == companyTwo){
        println("Companies are similar")
    }else{
        println("Companies are not similar")
    }

    // the copy method
    var companyThree = companyOne.copy()
    println(companyThree)
}


data class Company(val name:String, val address: String){

}