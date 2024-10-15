fun main() {
    var firstName: String = "John"
    var lastName: String = "Doe"
    var fullName: String = "$firstName $lastName"

    var address: String = """
        1511 - 11th Street
        Pine Street
        400-D North Street
    """

    // to make it no space
    var addressSpace: String = """
        |1511 - 11th Street
        |Pine Street
        |400-D North Street
    """.trimMargin()


    println(firstName)
    println(lastName)
    println(fullName)
    println(address)
    println(addressSpace)
}