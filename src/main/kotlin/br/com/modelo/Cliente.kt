package br.com.modelo

class Cliente(
    val nome: String,
    val cpf: String,
    private val senha: Int,
    val endereco: Endereco,
    var contato: Contato,
) : Autenticavel {
    override fun autentica(senha: Int): Boolean {
        when (this.senha) {
            senha -> {
                return true
            }
            else -> return false
        }
    }

    override fun toString(): String {
        return """
            nome: $nome
            cpf: $cpf
            senha: $senha
            endereço: $endereco
            contato: $contato
        """.trimIndent()
    }


}