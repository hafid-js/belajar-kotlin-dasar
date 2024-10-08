fun main () {

    var counter: Int = 0

    val lambdaIncrement: () -> Unit = {
        println("Lambda Increment")
        counter++
    }

    val anonymouIncrement = fun () {
        println("Anonymous Function Increment")
        counter++
    }

    fun functionIncrement() {
        println("Function Increment")
        counter++
    }

    lambdaIncrement()
    anonymouIncrement()
    functionIncrement()
    lambdaIncrement()
    anonymouIncrement()
    functionIncrement()

    println(counter)
}