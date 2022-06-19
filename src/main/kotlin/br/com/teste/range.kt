package br.com.teste

fun range() {
    val range = 1.rangeTo(5)
    for (r in range) {
        println(r)
    }

    println()
    val sequencia = 0..3
    for (s in sequencia) {
        println(s)
    }
}
