@file:JvmName("Interfaces")

package OOP

interface dateFinder{
    fun setDate(day: Int, month: Int = 8, year: Int = 2022)
    fun setDate(date:agrarianDate) = setDate(date.day)
}
// second interface with a similar named method
interface correctDate{
    fun setDate(date: agrarianDate){}
}
// set class to define date type
class agrarianDate{
    var day:Int = 25
    var month:Int = 6
    var year: Int = 2022
}

class dateFinderImplementation : dateFinder, correctDate{

    override fun setDate(date:agrarianDate){
        //using the super keyword and the generic parameter to specify which interface is being overriden
        super<correctDate>.setDate(date)
        super<dateFinder>.setDate(date)
    }
    override fun setDate(day: Int, month: Int, year: Int){}
}