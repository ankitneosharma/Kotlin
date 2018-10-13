package work.space

// prefix with Secondary Constructor
// Must deligate to primary constructor directly or indirectly
// Deligation of primary or secondary constructor is cone using this key word

fun main(arge: Array<String>){

    var cat = Animal("wild cat", "Black", true)
    println("name of cat is ${cat.name}")
}

class Animal(var name: String){
    //properties or member variables
    var color: String = "Red"
    var dangerous: Boolean = false
    //Primary Constructor
    init{
        println("Default values are color = ${this.color} & dangerous = ${this.dangerous}")
    }
    //First Secondary Constructor
    constructor(name: String, color: String):this(name){
        this.color = color
        println("First Secondary")
    }
    //Second Secondary constructor
    constructor(name: String, color: String, dangerous: Boolean):this(name, color){
        this.dangerous = true
        println("Second Secondary Name = ${this.name} color = ${this.color} dangerous = ${this.dangerous}")
    }
}

