package Class

class Person (
    val name: String,
    val age: Int
        )

fun main(){
    val person = Person("DALTON",20)
    val person2 = Person("Viriato",54)

    println("Person 1: ${person.name} have ${person.age} years old")
    println("Person 2: ${person2.name} have ${person.age} years old")

}