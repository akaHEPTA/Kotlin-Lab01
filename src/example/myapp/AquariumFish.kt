package example.myapp

class Shark : FishAction by PrintingFishAction("Hunt and eat fish"), FishColor {
    override val color = "gray"
}

class Plecostomus(fishColor: FishColor = GoldColor) : FishAction by PrintingFishAction("eat algae"),
    FishColor by fishColor

interface FishAction {
    fun eat()
}

interface AquariumAction {
    fun eat()
    fun jump()
    fun clean()
    fun catchFish()
    fun swim() {
        println("swim")
    }
}

interface FishColor {
    val color: String
}

object GoldColor : FishColor {
    override val color = "gold"
}

class PrintingFishAction(val food: String) : FishAction {
    override fun eat() {
        println(food)
    }
}

sealed class Seal
class Sealion : Seal()
class Walrus : Seal()

fun matchSeal(seal: Seal): String {
    return when (seal) {
        is Walrus -> "walrus"
        is Sealion -> "sea lion"
    }
}