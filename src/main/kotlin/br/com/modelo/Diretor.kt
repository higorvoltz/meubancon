package br.com.modelo

class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int,
    val plr: Double
) : FuncionarioAutenticavel(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = senha
), Autenticavel {


    override fun bonificacao(): Double {
        return salario * 0.3 + plr
    }

    override fun toString(): String {
        return """
nome: $nome
cpf: $cpf
salário: R$ $salario
PLR: R$ $plr
bonificação: R$ ${bonificacao()}
        """.trimIndent()
    }


}