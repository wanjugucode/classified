data class Book(var Title:String, var Author:String,var pages:Int)
fun groupedBooks(book:Book):List<Book>{
 var Book= mutableListOf<String>()
   Book.sortedBy { Book->Book. }

}




fun negativeIntegers(){
    var square=1

}
open class Truck(var registration:String,var totalWeight:Double,var capacity:Int){
fun load(weight: Int){
  var totalWeight=weight+totalWeight
    println(totalWeight)
}
fun unload(weight: Int){
    var totalWeight=totalWeight-weight
    println(totalWeight)
}
//fun weightCheck(){
//    if (load<=totalWeight){
//
//    }
}
 //}
class Trailer( registration:String, totalWeight:Double,capacity:Int):Truck(registration,totalWeight,capacity){
fun weightCheck(wheels: Int){
   var weightPerWheel=totalWeight/wheels
    println(weightPerWheel)
}
}

fun main(){
    var library= listOf(
        Book("Tortoise","Kenneth",300),
        Book("The gate","Hellen",330),
        Book("Arrow","Johnnes",390),
        Book("Hunter","Mary",400)
    )
    println(library)


    var truck=Truck("213",1880.0,10)
    truck.load(500)
    truck.unload(600)


    var trailer=Trailer("213",1880.0,10)
    trailer.weightCheck(6)
}