fun main() {

    // val range = 1..100
    // if the value is down to
    val range = 100 downTo 1

    println(range)
    println(range.count())
    println(range.contains(50))
    println(range.contains(200))
    println(range.first)
    println(range.last)
    println(range.step)


    // If we want to make it couting every 5 steps
    val rangeSteps = 100 downTo 1 step 5

    println(rangeSteps)
    println(rangeSteps.count())
    println(rangeSteps.contains(50))
    println(rangeSteps.contains(200))
    println(rangeSteps.first)
    println(rangeSteps.last)
    println(rangeSteps.step)
}