package br.com.modelo

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int
) : FuncionarioAutenticavel(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = senha
), Autenticavel {


    override fun bonificacao(): Double {
        return salario * 0.25
    }

    override fun toString(): String {
        return """
nome: $nome
cpf: $cpf
salário:R$ $salario
bonificação: ${bonificacao()}
        """.trimIndent()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        return true
    }

    override fun hashCode(): Int {
        return javaClass.hashCode()
    }


}