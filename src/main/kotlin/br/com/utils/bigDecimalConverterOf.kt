package br.com.utils

import java.math.BigDecimal

fun bigDecimalConverterOf(vararg value: String): Array<BigDecimal> {
    return Array<BigDecimal>(value.size) { index ->
        value[index].toBigDecimal()
    }
}