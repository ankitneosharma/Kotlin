package work.space


fun main(args: Array<String>){

    var result = calculateSum(10, 5, 1)
//    println("Result is $result")
    var result1 = subtract(4,7)
    println(result1)
}

fun calculateSum(num1: Int, num2: Int, Operator: Int) {
    var result: Int
    when(Operator){
        1-> println("Sum of Number $num1 and $num2 is ${num1 + num2}")
        2 -> println("Sutraction of Numbers is ${num1 - num2}")
        3 -> println("Multiplication of Numbers is ${num1 * num2}")
        4 -> println("Division of Numbers is ${num1 / num2}")
        else -> println("Wrong Operator")
    }
}

// Subtract expression
fun subtract(a: Int, b: Int) = if(a>b) a - b else b - a

// Subtract consised
fun subtract1(a: Int, b: Int): Int { if(a>b) return a - b else return b - a}

// Subtract function
fun subtract2(a: Int, b: Int): Int
    {
        if(a>b){
            return a - b
        } else {
            return b - a
        }
    }



// Functiomn with return type String
fun myfunction(a: String, b: String): String{
    return "function"
}

// Functiomn with return type Void
fun myvoidfunction(a: String): Unit{
    println("my void function")
}

