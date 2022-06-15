fun testeFuncionario() {
    val higor = Analista(nome = "Higor", cpf = "111.111.111-11", salario = 5500.0)
    println("nome funcionario ${higor.nome}")
    println("cpf funcionario ${higor.cpf}")
    println("salario ${higor.salario}")
    println("bonificacao ${higor.bonificacao()}")

    val amorim = Gerente(
        nome = "Amorim",
        cpf = "000.000.000-00",
        salario = 12000.0,
        senha = 123456
    )
    if (amorim.autentica(123450)) {
        println("autenticou com sucesso")
    } else {
        println("falhou autenticação")
    }
    println("bonificacao gerente ${amorim.bonificacao()}")

    val henrique = Diretor(
        nome = "Henrique",
        cpf = "222.222.222-22",
        salario = 15000.0,
        senha = 999999,
        plr = 8000.0
    )

    println("plr diretor ${henrique.plr}")

    val rubens = Analista(
        nome = "Rubens",
        cpf = "999.999.999-99",
        salario = 8000.0
    )

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(henrique)
    calculadora.registra(amorim)
    calculadora.registra(higor)
    calculadora.registra(rubens)

    println("total bonificacao ${calculadora.total}")
    println("salario analista ${rubens.salario}")
}