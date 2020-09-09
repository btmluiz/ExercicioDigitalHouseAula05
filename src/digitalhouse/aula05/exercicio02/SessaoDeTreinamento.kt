package digitalhouse.aula05.exercicio02

class SessaoDeTreinamento(var experiencia: Int = 1) {
    fun treinoA(jogador: JogadorDeFutebol) {
        jogador.correr()
        jogador.fazerGol()
        jogador.correr()

        println("[${jogador.nome}]: Experiencia inicial: ${jogador.experiencia}")
        jogador.experiencia += this.experiencia
        println("[${jogador.nome}]: Experiencia final: ${jogador.experiencia}")
    }
}