import br.com.exception.SaldoInsuficienteException
import br.com.modelo.*
import br.com.teste.testeAny
import br.com.teste.testeExpressao
import br.com.teste.testeObjects
import java.util.Objects

fun funcao2() {
    println("inicio funcao 2")
    for (i in 1..5) {
        println(i)
    }
    val endereco = Any()
    try {
        endereco as Endereco
    } catch (e: SaldoInsuficienteException) {
        println(e.printStackTrace())
        throw SaldoInsuficienteException("Saldo insuficiente")
    } catch (e: Exception) {
        println("exception genérica capturada")
    }

    println("fim função 2 ")
}

fun funcao1() {
    println("inicio funcao 1")
    funcao2()
    println("fim funcao1")
}


fun main() {
    //testeCondicoes(saldo)
    println("meu banco")
    //testeCopiaRefeencia()
    testeComportamentoFuncao()
    //testeFuncionario()
    testeAutenticacao()
    //testeObjects()
    //testeAny()
    //testeExpressao()
    //funcao1()



}











