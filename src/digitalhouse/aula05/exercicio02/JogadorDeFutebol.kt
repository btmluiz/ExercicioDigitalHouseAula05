package digitalhouse.aula05.exercicio02

class JogadorDeFutebol(
        var nome: String,
) {
    var energia: Int = 100
    var alegria: Int = 0
    var gols: Int = 0
    var experiencia: Int = 0

    fun fazerGol(){
        energia -= 5
        alegria += 10
        gols++
        println("[$nome]: GOOOOOOL!!!!!")
    }

    fun correr(){
        energia -= 10

        println("[$nome]: Cansei")
    }
}