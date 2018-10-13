package work.space

fun main(args: Array<String>){
    var customer1 = Customer("Ankit", 1000.0)
    var customer2 = Customer("Ankit", 1000.0)
    //without use of data class we will be comparing the object id's in below and with data class we will compare the content
    if (customer1 == customer2){
        println("Equal")
    } else {
        println("UnEqual")
    }
    var customer3 = customer1.copy("Vivek")
    println("Customer1 is" + customer1)
    println("Customer2 is" + customer2)
    println("Customer3 is" + customer3)
}

data class Customer(var name: String, var balance: Double){

}
