package work.space

fun main(args: Array<String>){
    describeHuman("Ankit", 26, 5.8, true)
}

fun describeHuman(name: String, age: Int, height: Double, smoke: Boolean){
    println("name : $name")
    println("age : $age")
    println("height : $height")
    println("smoke : $smoke")
}
