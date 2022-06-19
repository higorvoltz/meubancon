package br.com.teste

import br.com.modelo.Cliente
import br.com.modelo.Livros

fun testeListas() {
    val livroA = Livros(
        titulo = "Memorias Postumas de Braz Cubas",
        autor = "Machado de Assis",
        anoPublicacao = 1835,
        editora = "ed A"
    )

    val livroB = Livros(
        titulo = "Macunaíma",
        autor = "Mario de Andrade",
        anoPublicacao = 1932,
        editora = "ed B"
    )

    val livroC = Livros(
        titulo = "Os Lusíadas",
        autor = "Camões",
        anoPublicacao = 1546,
        editora = "ed C"
    )

    val livros = mutableListOf<Livros>(livroA, livroB, livroC)
    println(livros)
    livros.add(Livros(titulo = "Sagarana", autor = "Guimarães Rosa", anoPublicacao = 1955))
    println(livros)
    val last = livros.last()
    println(last)
    val first = livros.first()
    println(first)
    livros.removeAt(0)
    println(livros)

    val ordenados = livros.sortedBy { it.autor }
    println(ordenados)

    val livroFiltrado = livros.filter { it.autor == "Camões" }
    println(livroFiltrado)

    val newListTituloLivro = livros.filter { it.autor.startsWith("M") }.sortedBy { it.anoPublicacao }.map { it.titulo }
    println(newListTituloLivro)


    val clienteA = (Cliente(nome = "Higor", cpf = "111.111.111-11", senha = 1111, endereco = null, contato = null))
    val clienteB = (Cliente(nome = "Henrique", cpf = "222.222.222-22", senha = 2222, endereco = null, contato = null))
    val clienteC = (Cliente(nome = "Amorim", cpf = "333.333.333-33", senha = 3333, endereco = null, contato = null))

    val clientes = mutableListOf<Cliente>(clienteA, clienteB, clienteC)
    println(clientes)
}
