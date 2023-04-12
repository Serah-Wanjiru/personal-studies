import javax.naming.Name

fun main() {
    var car=Car("harrier","legacy","black",25)
    car.carry(29,4)
    car.identity()
    var l=car.calculateparkingfees(10)
    println(l)
    var bus=Bus("city hopper","legacy","white",70)
    var x=bus.maxtripfare(100.0)
    println(x)
    var y=bus.calculateparkingfees(12)
    println(y)
    var person=Person("serah",18)
    println(person.name)
    println(person.age)
    var rectangle=Rectangle(45,2)
    rectangle.calculateArea()
    var human=Human("serah","female","black",50.0,56.4)
    human.rest()
    human.identity()


}
//Create a class Car with the following attributes: make, model, color, capacity.
//It has these functions:
//- carry(people: Int) : Prints out “Carrying $people passengers” if the
//number of people is within its capacity else it prints out “Over capacity
//by $x people” where x is the number of people exceeding its capacity
open class Car(var make:String,var model:String,var color:String,var capacity:Int){
    fun carry(people:Int,x:Int){
        if (people==capacity){
            println("Carry $people passengers")
        }
        else {
            println("Over capacity by $x people")
        }

    }
    //- identity() : Prints out the color, make and model in the following
    //format e.g: “I am a white subaru legacy” (1 point)

    fun identity(){
        println("I am a black harrier legacy")
    }
    //- calculateParkingFees(hours: Int) : Calculates and returns the
    //parking fees by multiplying the hours by 20 (1 point)
    open fun calculateparkingfees(hours:Int):Int{
        val s=hours*20
        return s
    }
}
//Create a class Bus with the same attributes and functions as the Car class.
//In addition, it has another method called maxTripFare(fare: Double) that
//calculates and returns the maximum amount of fare that can be collected per
//trip.
class Bus( make:String, model:String,color:String, capacity:Int):Car(make,model,color,capacity){
    fun maxtripfare(fare:Double):Double{
        val v=fare*capacity
        return v
    }
   // The bus’ calculateParkingFees method returns the product of hours and
  //  the capacity of the bus

    override fun calculateparkingfees(hours:Int):Int {
        val s = hours * capacity
        return s
    }

}
//Create a class called Person with properties name and age. Write a method to print out the person's name and age in Kotlin.
class Person(var name:String,var age:Int){


}
//Create a class called Rectangle with properties width and height. Write a method to calculate the area of the rectangle in Kotlin.
class Rectangle(var width:Int,var height:Int) {
    fun calculateArea(){
        println(width*height)
    }
}
//create a class called Human with the properties name gender color height and weight.
// i) create two functions one called rest and the other one identitiy.
// function rest prints out "sleep eight hours and   am female and my name is serah."
class Human(var name:String,var gender:String,var color:String,var height:Double,var weight:Double){
    fun rest(){
        println("sleep eight hours")
    }
    fun identity(){
        println("Am $gender and my name is $name")
    }
}

