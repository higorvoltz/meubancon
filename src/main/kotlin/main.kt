fun testeCondicoes(saldo: Double) {
    when {
        saldo > 0.0 -> println("conta é positiva")
        saldo == 0.0 -> println("conta neutra")
        else -> println("conta negativa")
    }
}

fun testeLacos() {
    for (i in 1..5) {
        val titular: String = "Higor $i"
        val numeroConta: Int = 1000 + i
        var saldo = i + 10.0

        println("titular $titular")
        println("numero da conta $numeroConta")
        println("saldo $saldo")
    }
}

fun testeCopiaRefeencia() {
    val contaHigor = Conta()
    contaHigor.titular = "Higor"
    contaHigor.numero = 1000
    contaHigor.saldo = 10000.0
    println(contaHigor.titular)
    println(contaHigor.numero)
    println(contaHigor.saldo)

    val contaSandra = Conta()
    contaSandra.titular = "Sandra"
    contaSandra.numero = 1001
    contaSandra.saldo = 2000.0
    println(contaSandra.titular)
    println(contaSandra.numero)
    println(contaSandra.saldo)

    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val contaJoao = Conta()
    contaJoao.titular = "João"

    var contaMaria = contaJoao

    println("titular conta João ${contaJoao.titular}")
    println("titular conta Maria ${contaMaria.titular}")
}

class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0

    fun deposita(valor: Double) {
        saldo += valor
    }

    fun saca(valor: Double) {
        if (saldo >= valor) {
            saldo -= valor
        } else {
            println("não é possível sacar, vc não tem cheque especial")
        }
    }

}


fun main() {
    //testeLacos()
    //testeCondicoes(saldo)
    println("meu banco")
    //testeCopiaRefeencia()

    println("depositando conta Higor")
    val contaHigor = Conta()
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
    val contaSandra = Conta()
    println("saldo anterior ${contaSandra.saldo}")
    //contaSandra.saldo += 50.0
    contaSandra.deposita(50.0)
    println("saldo após depósito ${contaSandra.saldo}")
    println("saldo anterior ${contaSandra.saldo}")
    contaSandra.saca(10.00)
    println("saldo após saque ${contaSandra.saldo}")


}



