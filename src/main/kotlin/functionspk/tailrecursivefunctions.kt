@file:JvmName("TailRecursion")

package functionspk

import java.math.BigInteger

fun main(args: Array<String>){
    println(fib(10, BigInteger("1"), BigInteger("0")))
}

// revisit again: fibonacci sequence

//tailrec function
tailrec fun fib(n: Int, a:BigInteger, b:BigInteger):BigInteger{
    return if(n == 0)b else fib(n-1, a+b, a)
}


