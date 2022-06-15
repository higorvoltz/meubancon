abstract class Conta(
    var titular: String,
    val numero: Int
) {
    var saldo = 0.0
        protected set


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

    /* fun getSaldo(): Double{
         return saldo
     }

     fun setSaldo(valor: Double){
         saldo = valor
     }*/

}