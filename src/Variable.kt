// CONST VAL immutable variable that would be able to access globally but, it cannot be change
const val APPLICATION = "Kotlin Basic"
const val VERSION = "0.0.1"

fun main() {

    // val is immutable means the value never change
    val firstName = "John"

    println(firstName)

    // var is mutable means the value can change
    // if we have a value that nullable we need to specify with '?' symbol
    var name: String? = null
    println(name)
    // For example, we want to know the length of name variable, because it's nullable we also need to specify with '?'
    println(name?.length)

    // but if we have the value of name length even though it's nullable we don't need to specify '?' while we want to print it
    var name1: String? = null
    name1 = "John"
    println(name1)
    println(name1.length)

    // print const val
    println("$APPLICATION: $VERSION")

}