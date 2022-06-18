package br.com.teste

fun testeExpressao() {
    println("inicio main")
    val entrada: String? = null
    val entradaConvertida: Int? = try {
        entrada?.toInt()
    } catch (e: NumberFormatException) {
        println("exceção de numero capturada")
        println(e.printStackTrace())
        null
    }
    if (entradaConvertida != null) {
        println("entrada convertida $entradaConvertida")
    } else {
        println("inseriu valor nulo")
    }
}
