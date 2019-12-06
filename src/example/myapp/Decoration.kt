package example.myapp

import java.awt.color.ICC_ProfileRGB

data class Decoration(val rocks: String) {

}

data class Decoration2(val rocks: String, val wood: String, val diver: String) {

}

fun makeDecorations() {
//    val decoration1 = Decoration("granite")
//    println(decoration1)
//    val decoration2 = Decoration("slate")
//    println(decoration2)
//    val decoration3 = Decoration("slate")
//    println(decoration3)

//    println(decoration1.equals(decoration2))
//    println(decoration3.equals(decoration2))

    val d5 = Decoration2("Crystal", "wood", "diver")
    println(d5)

    val (rock, _, diver) = d5
    println(rock)
//    println(wood)
    println(diver)
}

enum class Color(val rgb: Int) {
    RED(0xff0000), GREEN(0x00ff00), BLUE(0x0000ff)
}

enum class Direction(val degrees:Int) {
    NORTH(0), SOUTH(180), EAST(90), WEST(270)
}

fun main() {
    makeDecorations()
    println(Direction.EAST.name)
    println(Direction.EAST.ordinal)
    println(Direction.EAST.degrees)
}