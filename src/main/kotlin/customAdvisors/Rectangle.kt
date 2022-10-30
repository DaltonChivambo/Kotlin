package customAdvisors

class Rectangle(val height:Int, val width:Int) {

    val isSquare get() = height == width

    // equivalent expression from top
    fun isSquaree() = height==width
}

fun main(){
    val rectangle: Rectangle = Rectangle(11,10)
    println(rectangle.isSquaree())
}