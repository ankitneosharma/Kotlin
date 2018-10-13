package work.space

import java.math.BigInteger

fun main(args: Array<String>){

    var result = findFactorial(7)
    var result1 = findFactorial1(BigInteger("7000"), BigInteger("1"))
    println(result)
    println(result1)

}

fun findFactorial(input: Int): Int{

    if(input == 0)
        return 1
    else
        return input * findFactorial(input - 1)
}

tailrec fun findFactorial1(input: BigInteger, result: BigInteger): BigInteger{

    if(input == BigInteger("0"))
        return result
    else
        return findFactorial1(input - BigInteger("1"), input*result)
}

/*
tailrec functions are used to modify the compiler so it can take large recursive values.
we can do this by taking the output in  variable and also by adding 'tailrec' before function name
 */
