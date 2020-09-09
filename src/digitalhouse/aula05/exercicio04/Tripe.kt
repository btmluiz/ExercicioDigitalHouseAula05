package digitalhouse.aula05.exercicio04

class Tripe(
        var dobrado: Boolean,
        var alturaMinima: Int,
        var alturaMaxima: Int,
        var alturaAtual: Int
) {

    fun definirAltura(novaAltura: Int) {
        if (novaAltura <= this.alturaMaxima && novaAltura >= this.alturaMinima){
            this.alturaAtual = novaAltura
            println("Altura definida")
            return
        }
        println("Nova altura muito alta ou muito baixa")
    }

    fun dobrar() {
        this.dobrado = true
        println("Dobrado")
    }

    fun desdobrar() {
        this.dobrado = false
        println("Desdobrado")
    }

    fun guardar() {
        if (prontoParaGuardar()) {
            println("Guardado")
        }
    }

    fun prontoParaGuardar(): Boolean {
        if (this.alturaAtual == alturaMinima && dobrado){
            return true
        }
        return false
    }

    fun usar() {
        if (prontoParaUsar()){
            println("Usando")
        }
    }

    fun prontoParaUsar(): Boolean {
        if (!dobrado && alturaAtual > (alturaMaxima/2)){
            return true
        }
        return false
    }
}