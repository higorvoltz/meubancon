class SistemaInterno {

    /*fun entra(gerente: Gerente){

    }

    fun entra(diretor: Diretor){

    }*/
    fun entra(funcionarioAutenticavel: Autenticavel, senha: Int){
        if (funcionarioAutenticavel.autentica(senha)){
            println("bem vindo ao byte bank")
        } else {
            println("falha autenticacao")
        }
    }

}