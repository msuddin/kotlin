package demo

fun main(args : Array<String>) {
    println("Running the main application")

    val dob = 29081986
    var age = 32

    println(dob)
    println(age)

    age = 2991
    println(age)

    if (dob == 29081986) {
        println("Dob is 29081986 and the value of true is ${true is Boolean}")
    }

    println("A to int: " + 'A'.toInt())

    println("Length of String is: ${"String".length}")
    println("1 + 2 = ${1 + 2}")
}