package digitalhouse.aula05.exercicio03

class Prova(
        var dificuldade: Int,
        var energiaNecessaria: Int
) {
    fun podeRealizar(atleta: Atleta): Boolean{
        if (atleta.nivel >= this.dificuldade && atleta.energia >= this.energiaNecessaria)
            return true
        return false
    }
}