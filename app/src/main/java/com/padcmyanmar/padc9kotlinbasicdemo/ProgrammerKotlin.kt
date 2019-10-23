package com.padcmyanmar.padc9kotlinbasicdemo

fun main() {

    val jake = Programmer("Jake", "Wharton", "Jave", "Hacker")

    ProgrammerUtils.sayHello(jake)

    val programmer = ProgrammerKotlin("Jake", "Wharton", "Kotlin", "Hacker")

    ProgrammerKotlin("Jake", "Wharton", "Kotlin", "hacker", 25)

    ProgrammerKotlin("Jake", "Wharton", "Kotlin", "hacker", 25, Address("google", "Amarican"))

    ProgrammerKotlin("Jake", "Wharton", "Kotlin", "hacker", address = Address("", ""))

    programmer.age = 18
    programmer.address = null

    programmer.printName()
    programmer.fullName

}

class ProgrammerKotlin(firstName: String, val lastName: String, val language: String, val skill: String) {

    var age: Int = 0
        set(value) {
            if (value > 0) {
                field = value
            }
        }


    var firstName: String = firstName
        set(value) {
            if (value.length > 0) {
                field = value
            }
        }
    var address: Address? = null

    constructor(
        firstName: String,
        lastName: String,
        language: String,
        skill: String,
        age: Int = 0,
        address: Address? = null
    ) :
            this(firstName, lastName, language, skill) {
        this.age = age
        this.address = address
    }

    companion object {
        //static
        private const val DEFAULT_AGE = 25
        private var counter = 0


        fun printTotal() {
            println("Total= $counter")
        }


    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ProgrammerKotlin

        if (lastName != other.lastName) return false
        if (language != other.language) return false
        if (skill != other.skill) return false
        if (age != other.age) return false
        if (firstName != other.firstName) return false
        if (address != other.address) return false

        return true
    }

    override fun hashCode(): Int {
        var result = lastName.hashCode()
        result = 31 * result + language.hashCode()
        result = 31 * result + skill.hashCode()
        result = 31 * result + age
        result = 31 * result + firstName.hashCode()
        result = 31 * result + (address?.hashCode() ?: 0)
        return result
    }

    override fun toString(): String {
        return "Programmer "
    }
}

//primary constructor
data class AddressKotlin(val homeAddress: String, val townShip: String)

fun ProgrammerKotlin.printName() {
    println("Mr. $firstName $lastName")
}

val ProgrammerKotlin.fullName
    get() = "$firstName ,$lastName"

