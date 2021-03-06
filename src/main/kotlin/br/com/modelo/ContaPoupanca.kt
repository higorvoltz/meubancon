package br.com.modelo

class ContaPoupanca(
    titular: Cliente,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
) {
    override fun saca(valor: Double) {
        if (this.saldo > valor) {
            this.saldo -= valor
        }
    }

    override fun autentica(senha: Int): Boolean {
        return titular.autentica(senha)
    }
}