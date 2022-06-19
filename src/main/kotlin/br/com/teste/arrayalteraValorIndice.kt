package br.com.teste

fun arrayAlteraValorIndice() {
    var salarios = doubleArrayOf(2300.0, 1500.50, 3800.0)
    //aplique 10% de aumento


    val aumento: Double = 1.1
    var indice: Int = 0
    for (salario in salarios) {
        salarios[indice] = salario * aumento
        indice++
    }
    println(salarios.contentToString())

    var salarios2 = doubleArrayOf(2300.0, 1500.50, 3800.0)

    for (indice in salarios2.indices) {
        salarios2[indice] = salarios2[indice] * aumento
    }
    println(salarios2.contentToString())
}
