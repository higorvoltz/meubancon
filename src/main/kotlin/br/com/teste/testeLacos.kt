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