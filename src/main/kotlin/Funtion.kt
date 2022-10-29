

fun main(){
    println(max(3,5))

    println("")
    println(max2(7,3))

    println("")
    println(max3(7,3))

    println("")
    //return 10 because the function is equal a 10 in the definition
    println(max4(7,9))
}

//Return max value in 2 parameters
//body block
fun max(a:Int, b:Int):Int {
    return if (a>b) a else b // body expression
}

//Simplify the function
fun max2(a:Int, b:Int): Int = if(a>b)a else b


fun max3(a:Int, b:Int) = if(a>b)a else b

fun max4(a:Int, b:Int) = 10