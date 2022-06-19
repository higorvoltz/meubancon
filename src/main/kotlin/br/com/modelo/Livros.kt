package br.com.modelo

data class Livros(
    val titulo: String,
    val autor: String,
    val anoPublicacao: Long,
    val editora: String? = null
) {
}