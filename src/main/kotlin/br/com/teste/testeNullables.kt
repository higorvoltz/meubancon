package br.com.teste

import br.com.modelo.Endereco
import java.util.*

fun testeNullables() {
    var enderecoNulo: Endereco? = Endereco(logradouro = "Rua X")
    println(enderecoNulo?.logradouro?.length)
    enderecoNulo?.let { println(it.logradouro?.uppercase(Locale.getDefault())) }

    val a: String? = null
    val vouSair: Boolean = if (a == "sol") true else false
    println(vouSair)

    fun teste(valor: Any) {  //safe cast
        val numero: Int? = valor as? Int
        println(numero)
    }

    teste("a")
}
