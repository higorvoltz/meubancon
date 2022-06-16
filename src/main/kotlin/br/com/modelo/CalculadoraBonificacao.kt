package br.com.modelo

class CalculadoraBonificacao {
    var total: Double = 0.0
        private set

    fun registra(funcionario: Funcionario) {
        println("nome ${funcionario.nome}")
        this.total += funcionario.bonificacao()
    }

    /*fun registra(funcionario: Any) {  //casting
        if (funcionario is Funcionario) {
            this.total += funcionario.bonificacao()
        }
    }*/


}