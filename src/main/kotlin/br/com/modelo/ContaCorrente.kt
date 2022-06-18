package br.com.modelo

import br.com.exception.SaldoInsuficienteException

class ContaCorrente(
    titular: Cliente,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
) {
    override fun saca(valor: Double) {
        val valorTaxa = valor + 0.1
        if (this.saldo > valorTaxa) {
            this.saldo -= valorTaxa
        } else if (this.saldo < 0){
            throw SaldoInsuficienteException("não pode sacar, conta zerada")
        }
    }

    override fun autentica(senha: Int): Boolean {
        return titular.autentica(senha)
    }
}