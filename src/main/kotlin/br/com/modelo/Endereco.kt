package br.com.modelo

class Endereco(
    val logradouro: String = "",
    val numero: Int = 0,
    val complemento: String? = "",
    val bairro: String = "",
    val cep: String = "",
    val cidade: String = "",
    val estado: String = "",
    val pais: String = ""
) {
    override fun toString(): String {
        return """
Logradouro: $logradouro , numero: $numero - complemento: $complemento
bairro: $bairro - cep: $cep 
cidade: $cidade - estado: $estado
país: $pais"
            """.trimIndent()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Endereco

        if (cep != other.cep) return false

        return true
    }

    override fun hashCode(): Int {
        return cep.hashCode()
    }

}
