import br.com.modelo.*
import br.com.teste.testeObjects
import java.util.Objects


fun imprime(valor: Any): Any {
    println(valor)
    return valor
}

fun main() {
    //testeLacos()
    //testeCondicoes(saldo)
    println("meu banco")
    //testeCopiaRefeencia()
    //testeComportamentoFuncao()
    //testeFuncionario()
    //testeAutenticacao()
    //testeObjects()

    val endereco = Endereco()
    val enderecoNovo = Endereco()
    println(endereco.equals(enderecoNovo))
    println(endereco.hashCode())
    println(enderecoNovo.hashCode())

    println(endereco.toString())
    println(enderecoNovo.toString())


}







