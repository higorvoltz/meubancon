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


}