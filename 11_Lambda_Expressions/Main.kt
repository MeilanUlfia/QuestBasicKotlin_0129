//uppercaseString()
fun uppercaseString(string: String): String {
    return string.uppercase()
}

fun main() {
    println(uppercaseString("hello"))
    // HELLO
}

//lambda
fun main() {
    println({ string: String -> string.uppercase() }("hello"))
    // HELLO
}
