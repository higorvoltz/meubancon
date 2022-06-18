import br.com.modelo.*

fun testeContasDiferentes() {
    val contatoHigor = Contato(telefoneFixo = "", telefoneCelular = "92222-2222", email = "mail@email.com")
    val enderecoHigor = Endereco(logradouro = "rua Z", numero = 222, complemento = "", bairro = "", cep="", cidade = "", estado = "", pais = "")
    val higor = Cliente(nome = "Higor", cpf = "111.111.111-11", senha = 1111, enderecoHigor, contatoHigor)
    val contaCorrente = ContaCorrente(
        titular = higor,
        numero = 1234
    )

    val contatoHenrique = Contato(telefoneFixo = "", telefoneCelular = "92222-2227", email = "m@email.com")
    val enderecoHenrique = Endereco(logradouro = "rua W", numero = 122, complemento = "", bairro = "", cep="", cidade = "", estado = "", pais = "")
    val henrique = Cliente(nome = "Henrique", cpf = "222.222.222-22", senha = 2222, enderecoHenrique, contatoHenrique)
    val contaPoupanca = ContaPoupanca(
        titular = henrique,
        numero = 4321
    )

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("saldo conta corrente ${contaCorrente.saldo}")
    println("saldo conta poupanca ${contaPoupanca.saldo}")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("saldo conta corrente após saque ${contaCorrente.saldo}")
    println("saldo conta poupanca após saque ${contaPoupanca.saldo}")

    contaCorrente.transfere(150.0, contaPoupanca, 1111)

    println("saldo conta corrente após transferencia ${contaCorrente.saldo}")
    println("saldo conta poupanca após transferencia ${contaPoupanca.saldo}")

    contaPoupanca.transfere(150.0, contaCorrente, 2222)

    println("saldo conta corrente após transferencia ${contaCorrente.saldo}")
    println("saldo conta poupanca após transferencia ${contaPoupanca.saldo}")
}
