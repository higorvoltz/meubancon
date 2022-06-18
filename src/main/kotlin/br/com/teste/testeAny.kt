package br.com.teste

import br.com.modelo.Endereco

fun testeAny() {
    val endereco = Endereco()
    val enderecoNovo = Endereco()
    println(endereco.equals(enderecoNovo))
    println(endereco.hashCode())
    println(enderecoNovo.hashCode())

    println(endereco.toString())
    println(enderecoNovo.toString())
}