package digitalhouse.aula05.exercicio02

fun main() {
    val jogador1 = JogadorDeFutebol("João")
    val jogador2 = JogadorDeFutebol("Vitoria")

    val sessaoA = SessaoDeTreinamento()
    sessaoA.treinoA(jogador1)
    sessaoA.treinoA(jogador2)
}