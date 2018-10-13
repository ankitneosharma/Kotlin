package work.space

//Kotlin will not allow to assign a null value to a variable, you will have to mark it as optional type

fun main(args: Array<String>){
    var message: String? = null
    println(message?.length)
}

