package wonuk.practice.componentscanpractice.fruitHandler


enum class Fruit {
    APPLE,
    BANANA,
}
interface FruitHandler {
    val type: Fruit
    fun foo()
}