fun main() {

    val examGrade = 80
    val exerciseGrade = 60
    val extraPoint = 80

    val examPass = examGrade > 75
    val exercisePass = exerciseGrade > 75
    val extraPass = extraPoint > 75

    // Read this from left to right
    // true && false = false
    val passAll = examPass && exercisePass && extraPass
    println(passAll)

}