fun testeContasDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = "Higor",
        numero = 1234
    )

    val contaPoupanca = ContaPoupanca(
        titular = "Henrique",
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

    contaCorrente.transfere(150.0, contaPoupanca)

    println("saldo conta corrente após transferencia ${contaCorrente.saldo}")
    println("saldo conta poupanca após transferencia ${contaPoupanca.saldo}")

    contaPoupanca.transfere(150.0, contaCorrente)

    println("saldo conta corrente após transferencia ${contaCorrente.saldo}")
    println("saldo conta poupanca após transferencia ${contaPoupanca.saldo}")
}
