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


}