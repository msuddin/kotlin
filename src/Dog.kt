package demo

open class Dog (name: String, var weight: Int, override var ownerName: String): Animal (name), AnimalOwner {

    init {
        println("Dog Class has been initialised")
    }

    override fun getInfo(): String {
        super.getInfo()
        return "The weight of the animal is $weight"
    }

    override fun getOwnerFavoriteTool(): String {
        return "A dog toy bone"
    }
}