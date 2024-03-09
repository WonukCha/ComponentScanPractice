package wonuk.practice.componentscanpractice.myInterface


enum class Fruit {
    APPLE,
    BANANA,
}
interface MyInterface {
    val type: Fruit
    fun foo()
}