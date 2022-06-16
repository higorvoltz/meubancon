package br.com.teste

import br.com.modelo.*

fun testeObjects() {
    val Caio = object : Autenticavel {
        val nome: String = "Caio"
        val senha: Int = 1111
        val cpf: String = "666.666.666-66"
        val logradouro: String = "Rua X"
        val numero: Int = 277
        val complemento: String = ""
        val bairro: String = ""
        val cep: String = ""
        val cidade: String = ""
        val estado: String = ""
        val pais: String = ""
        val telefoneFixo: String = ""
        val telefoneCelular: String = "91111-1111"
        val email: String = "email@email.com"
        override fun autentica(senha: Int) = this.senha == senha
    }

    println("nome cliente ${Caio.nome}")

    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(Caio, 1111)


    val higorContato = Contato(telefoneFixo = "", telefoneCelular = "91111-1111", email = null)
    val enderecoHigor = Endereco(
        logradouro = "rua C",
        numero = 0,
        complemento = null,
        bairro = "",
        cep = "",
        cidade = "",
        estado = "",
        pais = ""
    )
    val higor =
        Cliente(nome = "Higor", cpf = "555.555.555-55", senha = 1111, contato = higorContato, endereco = enderecoHigor)
    val contaPoupanca = ContaPoupanca(titular = higor, numero = 1234)

    val sandraContato = Contato(telefoneFixo = "", telefoneCelular = "91111-1111", email = null)
    val enderecoSandra = Endereco(
        logradouro = "rua C",
        numero = 0,
        complemento = null,
        bairro = "",
        cep = "",
        cidade = "",
        estado = "",
        pais = ""
    )
    val sandra = Cliente(
        nome = "Sandra",
        cpf = "777.555.555-55",
        senha = 1111,
        contato = sandraContato,
        endereco = enderecoSandra
    )
    val contaCorrente = ContaCorrente(titular = higor, numero = 1234)

    //testeContasDiferentes()

    println("total contas ${Conta.total}")
}
