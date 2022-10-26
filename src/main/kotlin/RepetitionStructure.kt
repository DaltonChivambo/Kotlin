

fun main(args: Array<String>){
    var shoppingList = arrayOf("Rice","Bean","Milk","Potato","Banana","Juice")


    var index = 0;

    while (shoppingList.size-1>=index){
        //println(shoppingList[index])
        index++
    }

    for (i in 0..5){
    //    println(shoppingList[i])
    }

    for (i in 0..shoppingList.size-1){
        println(shoppingList[i])
    }
}