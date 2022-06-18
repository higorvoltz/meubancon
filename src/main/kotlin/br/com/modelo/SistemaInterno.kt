package br.com.modelo

import br.com.exception.AcessoSistemaException
import br.com.modelo.Autenticavel

class SistemaInterno {

    /*fun entra(gerente: modelo.Gerente){

    }

    fun entra(diretor: modelo.Diretor){

    }*/
    fun entra(funcionarioAutenticavel: Autenticavel, senha: Int){
        if (funcionarioAutenticavel.autentica(senha)){
            println("bem vindo ao byte bank")
        } else {
            println("falha autenticacao")
            throw AcessoSistemaException("senha incorreta")
        }
    }

}