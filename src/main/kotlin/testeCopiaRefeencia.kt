fun testeCopiaRefeencia() {
    val contaHigor = ContaCorrente("Higor", 1000)
    contaHigor.deposita(10000.0)
    println(contaHigor.titular)
    println(contaHigor.numero)
    println(contaHigor.saldo)

    val contaSandra = ContaPoupanca("Sandra", 1001)
    contaSandra.deposita(2000.0)
    println(contaSandra.titular)
    println(contaSandra.numero)
    println(contaSandra.saldo)

    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val contaJoao = ContaCorrente("João", 1002)
    //contaJoao.titular = "João"

    var contaMaria = contaJoao

    println("titular conta João ${contaJoao.titular}")
    println("titular conta Maria ${contaMaria.titular}")
}