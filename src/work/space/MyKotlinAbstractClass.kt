package work.space

abstract class Bird(){
    abstract var color: String
    abstract fun eat()
    abstract fun sleep()
    abstract fun walk()
    fun layEgg(){
        println("Bird lays Eggs")
    }
}
// Child class Owl implements Birds and can access its properties, it needs all its properties implemented.
// Override can work on Open or Abstract properties only
class Owl: Bird(){
    override fun walk() {
        println("Owl Walks")
    }

    override var color: String = "Green"

    override fun eat(){
        println("Owl Eats")
    }
    override fun sleep(){
        println("Owl Sleeps")
    }
}

fun main(args: Array<String>){
    //Cannot access abstract class Bird directly but can access its child class
    var bird = Owl()
    bird.eat()
    bird.sleep()
    bird.layEgg()
}
