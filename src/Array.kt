fun main() {

    val names: Array<String> = arrayOf("John", "Smith", "Jane")
    // The variable val cannot be changed, but the value of val can be changed
    names[0] = "John"
    println(names[0])

    val numbers: Array<Int> = arrayOf(10, 9, 8)
    println(numbers[0])
    println(numbers[1])
    println(numbers[2])

    // If we want to have a nullable value
    val members: Array<String?> = arrayOfNulls(5)
    members[0] = "John"
    members[1] = "John"
    members[2] = "John"
    members[3] = "John"
    members[4] = null
    println(members[0])
    println(members.size)

}