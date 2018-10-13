package work.space

// By default Any() is the super class for all classes
fun main(args: Array<String>){

    var lion = Lion()
    lion.color = "Red"
    lion.legs = 4
    lion.eat()

    var deer = Dear()
    deer.color = "Brown"
    deer.legs = 4
    deer.eat()
    deer.sleep()

    var animals = Animals()
    animals.color = "unknown"
    animals.legs = 0
    animals.eat()

    var tiger = Tiger()
    tiger.color = "Stripes"
    tiger.legs = 4
    tiger.eat()
    tiger.dangerous = true
    tiger.age
}

// All classes in Kotlin are by default public and final, use open if u need to change the class type
open class Animals{
    var color: String = ""
    var legs: Int = 0
    fun eat(){}
}

// here Lion is child class and Animal is super class, syntax :- childClass : superClass
open class Lion: Animals(){
    var dangerous: Boolean = false
    var age = 0
}

class Tiger: Lion(){}
class Dear: Animals(){
    fun sleep(){}
}


