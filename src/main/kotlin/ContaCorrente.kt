class ContaCorrente(
    titular: String,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
) {
    override fun saca(valor: Double) {
        val valorTaxa = valor + 0.1
        return super.saca(valorTaxa)
    }

}