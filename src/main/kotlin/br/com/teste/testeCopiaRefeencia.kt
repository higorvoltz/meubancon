import br.com.modelo.*

fun testeCopiaRefeencia() {
    val contatoHigor = Contato(telefoneFixo = "", telefoneCelular = "96666-6666", email = "contato@contato.com")
    val enderecoHigor = Endereco(logradouro = "Q", numero = 78, complemento = null, bairro = "", cep = "", cidade = "", estado = "", pais = "")
    val higor = Cliente(nome = "Higor", cpf = "111.111.111-11", senha = 1111, enderecoHigor, contatoHigor)
    val contaHigor = ContaCorrente(higor, 1000)
    contaHigor.deposita(10000.0)
    println(contaHigor.titular)
    println(contaHigor.numero)
    println(contaHigor.saldo)

    val contatoSandra = Contato(telefoneFixo = "", telefoneCelular = "96666-6669", email = "conta@contato.com")
    val enderecoSandra = Endereco(logradouro = "QRS", numero = 178, complemento = null, bairro = "", cep = "", cidade = "", estado = "", pais = "")
    val sandra = Cliente(nome = "Sandra", cpf = "222.222.222-22", senha = 2222, enderecoSandra, contatoSandra)
    val contaSandra = ContaPoupanca(sandra, 1001)
    contaSandra.deposita(2000.0)
    println(contaSandra.titular)
    println(contaSandra.numero)
    println(contaSandra.saldo)

    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val contatoJoao = Contato(telefoneFixo = "", telefoneCelular = "96666-6660", email = "c@contato.com")
    val enderecoJoao = Endereco(logradouro = "Qop", numero = 188, complemento = null, bairro = "", cep = "", cidade = "", estado = "", pais = "")
    val joao = Cliente(nome = "João", cpf = "333.333.333-33", senha= 3333, enderecoJoao, contatoJoao)
    val contaJoao = ContaCorrente(joao, 1002)
    //contaJoao.titular = "João"

    var contaMaria = contaJoao

    println("titular conta João ${contaJoao.titular}")
    println("titular conta Maria ${contaMaria.titular}")
}