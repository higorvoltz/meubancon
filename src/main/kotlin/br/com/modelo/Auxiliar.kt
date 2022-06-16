package br.com.modelo

class Auxiliar(
    nome: String,
    cpf: String,
    salario: Double
): Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {

    override fun bonificacao(): Double {
        return salario * 0.11
    }

    override fun toString(): String {
        return """
nome: $nome
cpf: $cpf
salário:R$ $salario
        """.trimIndent()
    }
}