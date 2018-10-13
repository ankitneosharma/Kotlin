package work.space

//No need to create instance of Calculator, we can directly access it
fun main(args: Array<String>){
    B.total
    B.calculateTotal()
    A().increase()
    B().increase()
    println("Total is " + B.total)
    B.show()
}
// Since Calculator is an object(singleton) there will only be one instance of Calculator for the application

open class A{
    fun increase(){
        B.total++
    }
    fun show(){
        println("this is Class A")
    }
}

class B{
    fun increase(){
        Companion.total++
    }

    companion object: A(){
        var total = 0

        fun calculateTotal(){
            println("Total is")
        }
    }

}
