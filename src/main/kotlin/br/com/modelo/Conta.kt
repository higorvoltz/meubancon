package br.com.modelo
abstract class Conta(
    var titular: Cliente,
    val numero: Int
) {
    var saldo = 0.0
        protected set
    companion object {
        var total = 0
            private set
    }
    init {
        println("total de contas")
        total++
    }
    fun deposita(valor: Double) {
        if (valor > 0) {
            saldo += valor
        }
    }
    abstract fun saca(valor: Double)
    fun transfere(valor: Double, contaDestino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            contaDestino.deposita(valor)
            return true
        }
        return false
    }


}