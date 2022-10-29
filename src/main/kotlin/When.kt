
fun main() {
    var option = 3
    when(option){
        1 -> println("Orange Juice")
        2 -> println("Grape Juice")
        3 -> println("StrawBerry Juice")
        else -> println("Invalid option")
    }

    var juice = when(option){
        1 -> "Orange"
        2 -> "Grape"
        3 -> "StrawBerry"
        else -> ""
    }
    println(juice)

    var reference = when(option){
        1 -> "Mark I"
        2 -> "BT 50"
        3 -> "Defender"
        else -> ""
    }
    print(reference)
}

