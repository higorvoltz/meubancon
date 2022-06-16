fun testeCondicoes(saldo: Double) {
    when {
        saldo > 0.0 -> println("conta é positiva")
        saldo == 0.0 -> println("conta neutra")
        else -> println("conta negativa")
    }
}