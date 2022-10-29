
fun main(args: Array<String>){

    //changeable
    var name = "Dalton Chivambo"
    println(name)

    name = "Kenny Massingue"
    println(name)

    //immutable
    val yearBirth = 2002;
    println(yearBirth)

    println("Hi my name is $name, i have $yearBirth years old!")



    println("The sum is: ${sum(10,10)}")
}

fun sum(a:Int,b:Int) =  a+b