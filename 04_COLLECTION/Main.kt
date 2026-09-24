fun main() {

    // Read only list
    val readOnlyShapes = listOf("triangle", "square", "circle")
    println(readOnlyShapes)

    // Mutable list with explicit type declaration
    val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
    println(shapes)

    // Read-only view of mutable list
    val shapesLocked: List<String> = shapes

    // Read-only set
    val readOnlyFruit = setOf("apple", "banana", "cherry", "cherry")
    println(readOnlyFruit)

    // Mutable set with explicit type declaration
    val fruit: MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry")

    // Read-only view of mutable set
    val fruitLocked: Set<String> = fruit

    // Read-only map
    val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(readOnlyJuiceMenu)

    // Mutable map with explicit type declaration
    val juiceMenu: MutableMap<String, Int> = mutableMapOf(
        "apple" to 100,
        "kiwi" to 190,
        "orange" to 100
    )
    println(juiceMenu)

    // Read-only view of mutable map
    val juiceMenuLocked: Map<String, Int> = juiceMenu

    // Access value in map
    println("The value of apple juice is: ${readOnlyJuiceMenu["apple"]}")
}
