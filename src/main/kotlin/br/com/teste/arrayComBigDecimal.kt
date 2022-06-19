package br.com.teste

import br.com.utils.bigDecimalConverterOf
import java.math.BigDecimal
import java.math.RoundingMode

fun arrayComBigDecimal() {
    val salarios = bigDecimalConverterOf("1500.00", "1550.00", "1555.00", "10000.00 ")
    println(salarios.contentToString())

    var aumento = "1.1".toBigDecimal()
    val salarioComAumento: Array<BigDecimal> = salarios
        .map { salario ->
            if (salario < "5000.00".toBigDecimal()) {
                salario + "500".toBigDecimal()
            } else {
                (salario * aumento).setScale(2, RoundingMode.UP)
            }
        }
        .toTypedArray()

    println(salarioComAumento.contentToString())
}
