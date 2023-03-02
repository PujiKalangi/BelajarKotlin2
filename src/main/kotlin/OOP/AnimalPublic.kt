package OOP

class AnimalPublic (val name: String,
                    val weight: Double,
                    val age: Int,
                    val isMammal: Boolean) {

}

fun main() {
    val cat = AnimalPublic("kathy", 2.5, 2, true)
    println(cat.name)
}
