fun main() {

    // Int
    var age: Int = 200
    println(age)

    // Float
    var sample: Float = 10.1F
    println(sample)

    // Literals
    var binary: Int = 0b010101010
    println(binary)

    // Underscore in number
    var price: Long = 9000_000_000L
    println(price)

    // Conversion
    // The result would be overflow, because integer only able to convert up to 2 billion, after it passed to 2 billion,
    // the value would become 400 millionths
    var priceInt: Int = price.toInt()
    println(priceInt)


}