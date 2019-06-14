package demo

open class Animal (val name: String) {

    init {
        println("Animal Class has been initialised")
    }

    open fun getInfo(): String {
        return "The name of the animal is $name"
    }

    fun animalSaysSomething(): String {
        return "Animal can speak"
    }
}

