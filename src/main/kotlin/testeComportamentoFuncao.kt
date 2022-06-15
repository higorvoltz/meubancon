fun testeComportamentoFuncao() {
    println("depositando conta Higor")
    val contaHigor = ContaCorrente(titular = "Higor", numero = 100)
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

    println("depositando conta Sandra")
    val contaSandra = ContaPoupanca("Sandra", 1001)
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
    when {
        contaHigor.transfere(20.0, contaSandra) -> {
            println("transferenci ok")

        }
        else -> {
            println("falha")
        }
    }
    println("saldo Higor apos transferencia ${contaHigor.saldo}")
    println("saldo Sandra apos transferencia ${contaSandra.saldo}")
}