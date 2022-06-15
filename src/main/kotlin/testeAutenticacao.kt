fun testeAutenticacao() {
    val gerente = Gerente(
        nome = "Reginaldo",
        cpf = "444.444.444-44",
        salario = 5000.0,
        senha = 1234
    )

    val diretor = Diretor(
        nome = "Messias",
        cpf = "888.888.888-88",
        salario = 9500.0,
        senha = 4321,
        plr = 5000.0
    )

    val cliente = Cliente(nome = "Cliente", cpf = "555.555.555-55", senha = 11111)


    val sistema = SistemaInterno()
    sistema.entra(gerente, 1234)
    sistema.entra(diretor, 4321)
    sistema.entra(cliente, 11111)
}