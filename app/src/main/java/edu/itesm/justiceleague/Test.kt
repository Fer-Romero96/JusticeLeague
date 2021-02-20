package edu.itesm.justiceleague

data class SuperHeroe(val nombre: String){
    var mail: String = "Vision"
    var movil: String = "@"
    var edad: Int = 56

    override fun toString(): String = "$nombre: $edad"
}

fun main(){
    println("Hello, world!!")
}