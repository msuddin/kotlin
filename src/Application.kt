package demo

fun main(args: Array<String>) {
    println("\n")
    var myAnimal = Animal("anAnimal")
    println(myAnimal.getInfo())
    println(myAnimal.animalSaysSomething())

    println("\n")
    var myDog = Dog("aDog", 5, "John")
    println(myDog.getInfo())
    println(myDog.getOwnerFavoriteTool())
    println(myDog.animalSaysSomething())

}
