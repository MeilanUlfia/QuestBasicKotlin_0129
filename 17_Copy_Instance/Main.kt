data class User(val name: String, val id: Int)

fun main() {
    val user = User("Alex", 1)
    val secondUser = User("Alex", 1)
    val thirdUser = User("Max", 2)

    // Membuat salinan yang tepat dari User
    println(user.copy())

    // Membuat salinan User dengan nama: "Max"
    println(user.copy("Max"))

    // Membuat salinan User dengan id: 3
    println(user.copy(id = 3))
}
