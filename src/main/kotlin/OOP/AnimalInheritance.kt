package OOP


open class AnimalInheritance(val name: String, val weight: Double, val age: Int, val isCarnivore: Boolean){

    open fun eat(){
        println("$name sedang makan!")
    }

    open fun sleep(){
        println("$name sedang tidur!")
    }
}

fun main () {

    class Cat(pName: String, pWeight: Double, pAge: Int, pIsCarnivore: Boolean, val furColor: String, val numberOfFeet: Int)
        : AnimalInheritance(pName, pWeight, pAge, pIsCarnivore) {

        fun playWithHuman() {
            println("$name bermain bersama Manusia !")
        }

        override fun eat(){
            println("$name sedang memakan ikan !")
        }

        override fun sleep() {
            println("$name sedang tidur di bantal !")
        }
    }

    val cat = Cat("Kathy", 3.2, 2, true, "Brown", 4)

    cat.playWithHuman()
    cat.eat()
    cat.sleep()
}