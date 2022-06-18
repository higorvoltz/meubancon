package br.com.modelo

import br.com.exception.AcessoSistemaException
import br.com.exception.SaldoInsuficienteException
import br.com.exception.ValorNegativoException

abstract class Conta(
    var titular: Cliente,
    val numero: Int
):Autenticavel {
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
        } else {
            throw ValorNegativoException("valor não pode ser negativo !!!")
        }
    }

    abstract fun saca(valor: Double)
    fun transfere(valor: Double, contaDestino: Conta, senha: Int) {
        if (saldo < valor) {
            throw SaldoInsuficienteException("saldo insuficiente")
        }

        if (!autentica(senha)){
            throw AcessoSistemaException("senha incorreta")
        }

        saldo -= valor
        contaDestino.deposita(valor)

    }


}