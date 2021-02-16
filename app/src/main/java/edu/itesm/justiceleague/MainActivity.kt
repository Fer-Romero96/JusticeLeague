package edu.itesm.justiceleague

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    data class SuperHeroe(val nombre: String, val mail: String, val movil: String, val edad: Int)
    fun main() {
        println("Hello, world!!!")

        val batman = SuperHeroe("Bruce Wayne","batman@itesm.mx","5536776645",25)

        // Tenemos que ponerle el tipo de dato en este caso SuperHeroe
        val jl = mutableListOf<SuperHeroe>()

        jl.add(batman)
        jl.add(SuperHeroe("CK","super","77",45))

        println(jl)

        println("Adios")

        println(batman)
    }
}