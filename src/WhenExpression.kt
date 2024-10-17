fun main() {

    var grade = "A"

    when (grade) {
        "A" ->  {
            println("Amazing")
        }
        "B" -> {
            println("Good")
        }
        "C" -> {
            println("Not bad")
        }
        "D" -> {
            println("Bad")
        }
        else -> {
            println("Try again")
        }
    }

    // When expression with multiple options
    when (grade) {
        "A", "B", "C" -> {
            println("Congrats you pass the exam!")
        } else -> {
            println("Try again next year")
        }
    }

    // When expression IN
    grade = "E"
    val passingGrade: Array<String> = arrayOf("A", "B", "C")
    when (grade) {
        in passingGrade -> println("You passed!")
        !in passingGrade -> println("BETTER LUCK NEXT TIME")
    }

    // When expression IS
    val name = "John"
    when(name) {
        is String -> println("Name is string")
        !is String -> println("Not string")
    }

    // When as IF replacement
    val examGrade = 90

    when {
        examGrade > 80 -> println("Good job")
        examGrade > 60 -> println("Not bad")
        else -> println("Try again next year")
    }
}