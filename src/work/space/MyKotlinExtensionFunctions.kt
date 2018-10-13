package work.space

fun main (args: Array<String>){

    var car1 = Car("Black", 40000)
    println(car1.carBrand("Jaguar"))

    var num1: Int = 5
    var num2: Int = 10
    num1.findMaximum(num2)

}

class Car(val color: String, val price: Int){

    fun carInfo(): String{
        return "Color = $color & Price = $price"
    }
}

fun Car.carBrand(brand: String): String{

    return " Brand = $brand & Color = ${this.color} & Price = ${this.price}"
}

fun Int.findMaximum(secondValue: Int){
    if (this > secondValue) println("$this is grater than $secondValue")
    else println("$secondValue is grater than $this")
}

/* Infix Functions:
- They are a member of functions or extension functions
- They have a single parameter
- They are marked with the word infix keyword
 */


