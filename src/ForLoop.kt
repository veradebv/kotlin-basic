fun main() {

    var array = arrayOf("John", "Jane", "Doe")
    var total = 0

    // For Array

    // name is variable but, it's immutable
    for (name in array) {
        println(name)
        // total++ is to count how many value inside the array itself, in this case is 3
        total++
    }

    println(total)

    // For Range

    val lengthArray = array.size - 1
    for (i in 0..lengthArray) {
        println("Index $i = ${array.get(i)}")
    }
}