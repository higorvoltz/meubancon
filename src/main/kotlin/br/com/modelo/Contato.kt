package br.com.modelo

class Contato(
    var telefoneFixo: String? = "",
    var telefoneCelular: String? = "",
    var email: String? = ""
) {

    override fun toString(): String {
        return """
telefone fixo: $telefoneFixo
telefone celular: $telefoneCelular
e-mail: $email
        """.trimIndent()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Contato

        if (telefoneFixo != other.telefoneFixo) return false
        if (telefoneCelular != other.telefoneCelular) return false
        if (email != other.email) return false

        return true
    }

    override fun hashCode(): Int {
        var result = telefoneFixo?.hashCode() ?: 0
        result = 31 * result + (telefoneCelular?.hashCode() ?: 0)
        result = 31 * result + (email?.hashCode() ?: 0)
        return result
    }

}
