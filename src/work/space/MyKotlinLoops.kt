package work.space


fun main(args: Array<String>) {

    //Print all numbers in range from 1 to 10

    //Print number 1..10 using for loop
    for (i in 1..10) {
        println("All Numbers using for are : " + i)
    }

    //Print even numbers between 1..10 using for loop
    for (i in 1..10) {
        if (i % 2 == 0) {
            println("Even numbers using for are : " + i)
        }
    }

    //Print using while loop
    var i = 1
    while(i <= 10){
        if (i % 2 != 0) {
            println("odd numbers using while are : " + i)
        }
        i++
    }

    //Print using do while loop
    var j = 1
    do{
        if (j % 2 == 0) {
            println("Even numbers using do while are : " + j)
        }
        j++
    }
        while(j <=10)

    //Loop counter statements

    // break statement will break loop with label myloop
    myloop@ for(i in 1..2){
        for(j in 1..10){
            println(" $i + $j")
            if(j == 5){
                println("We have reached value of $j equal to 5")
                break@myloop
            }
        }

    }

    // continue statement will miss the statement
    for(i in 1..10) {
        if (i == 5) {
            continue
        }
        println("$i is the value")
    }
}
