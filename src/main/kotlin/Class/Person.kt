
class Person (
    val name: String,
    val age: Int
        )

fun main(){
    val person: Person = Person("DALTON",20)
    val person2: Person = Person("Viriato",54)

    println("Person 1: ${person.name}")
    println("Person 2: ${person2.name}")

}