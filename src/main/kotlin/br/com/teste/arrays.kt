package br.com.teste

fun arrays() {
    val idade1: Int = 25
    val idade2: Int = 30
    val idade3: Int = 35

    val maiorIdade = if (idade1 > idade2 && idade1 > idade3) {
        println(idade1)
    } else if (idade2 > idade1 && idade2 > idade3) {
        println(idade2)
    } else {
        println(idade3)
    }

    println(maiorIdade)

    val idades = intArrayOf(idade1, idade2, idade3, 10)

    var maior: Int = Int.MIN_VALUE
    for (idade in idades) {
        if (idade > maior) {
            maior = idade
        }
    }
    println(maior)

    var menor: Int = Int.MAX_VALUE
    idades.forEach { idade ->
        if (idade < menor) {
            menor = idade
        }
    }
    println(menor)
}
