import br.com.exception.AcessoSistemaException
import br.com.exception.SaldoInsuficienteException
import br.com.modelo.*

fun testeComportamentoFuncao() {
    println("depositando conta Higor")
    val contatoHigor = Contato(telefoneFixo = "", telefoneCelular = "98888-8888", email = "e@email.com")
    val enderecoHigor = Endereco(
        logradouro = "ZZ",
        numero = 444,
        complemento = null,
        cep = "",
        bairro = "",
        cidade = "",
        estado = "",
        pais = ""
    )
    val higor = Cliente(nome = "Higor", cpf = "111.111.111-11", senha = 1111, enderecoHigor, contatoHigor)
    val contaHigor = ContaCorrente(higor, numero = 100)
    println("saldo anterior ${contaHigor.saldo}")
    //contaHigor.saldo += 100.0
    contaHigor.deposita(100.0)
    println("saldo após depósito ${contaHigor.saldo}")
    println("saldo anterior ${contaHigor.saldo}")
    contaHigor.saca(35.0)
    println("saldo após saque ${contaHigor.saldo}")
    println("saldo anterior ${contaHigor.saldo}")
    contaHigor.saca(1000.0)
    println("saldo após saque ${contaHigor.saldo}")


    println()

    val contatoSandra = Contato(telefoneFixo = "", telefoneCelular = "97777-8888", email = "mail@email.com")
    val enderecoSandra = Endereco(
        logradouro = "ZZZ",
        numero = 0,
        complemento = null,
        cep = "",
        bairro = "",
        cidade = "",
        estado = "",
        pais = ""
    )
    val sandra = Cliente(nome = "Sandra", cpf = "222.222.222-22", senha = 2222, enderecoSandra, contatoSandra)
    println("depositando conta Sandra")
    val contaSandra = ContaPoupanca(sandra, numero = 1001)
    println("saldo anterior ${contaSandra.saldo}")
    //contaSandra.saldo += 50.0
    contaSandra.deposita(50.0)
    println("saldo após depósito ${contaSandra.saldo}")
    println("saldo anterior ${contaSandra.saldo}")
    contaSandra.saca(10.00)
    println("saldo após saque ${contaSandra.saldo}")

    println()

    println("transfere conta Higor para Sandra")
    println("saldo Higor antes transferencia ${contaHigor.saldo}")
    println("saldo Sandra antes transferencia ${contaSandra.saldo}")

    try {
        contaHigor.transfere(5.0, contaSandra, 1111)
        println("transferencia ok")
    } catch (e: SaldoInsuficienteException){
        println("saldo insuficiente")
        e.printStackTrace()
    } catch (e: AcessoSistemaException){
        println("exception acesso")
        e.printStackTrace()
    } catch (e: Exception){
        println("exception genérica")
        e.printStackTrace()
    }

    println("saldo Higor apos transferencia ${contaHigor.saldo}")
    println("saldo Sandra apos transferencia ${contaSandra.saldo}")

    println()
    println("saldo Higor antes depósito negativo ${contaHigor.saldo}")
    contaHigor.deposita(-10.0)
    println("saldo Higor após depósito negativo ${contaHigor.saldo}")


    /* println("testa exception saldo")
     contaHigor.saca(40.0)
     println("saldo conta corrente ${contaHigor.saldo}")
     contaHigor.saca(45.0)
     println("saldo conta corrente ${contaHigor.saldo}")*/

}