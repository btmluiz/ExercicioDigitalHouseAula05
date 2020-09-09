package digitalhouse.aula05.exercicio03

fun main() {
    val atleta1 = Atleta("Joao", 5, 8)
    val atleta2 = Atleta("Vitoria", 6, 12)

    val provaA1 = Prova(3, 2)
    val provaA2 = Prova(10, 34)
    val provaA3 = Prova(5, 1)

    val provaB1 = Prova(6, 9)
    val provaB2 = Prova(2, 6)
    val provaB3 = Prova(8, 13)

    println("[${atleta1.nome}]: ProvaA1 - ${provaA1.podeRealizar(atleta1)}")
    println("[${atleta1.nome}]: ProvaA2 - ${provaA2.podeRealizar(atleta1)}")
    println("[${atleta1.nome}]: ProvaA3 - ${provaA3.podeRealizar(atleta1)}")

    println("[${atleta2.nome}]: ProvaB1 - ${provaB1.podeRealizar(atleta2)}")
    println("[${atleta2.nome}]: ProvaB2 - ${provaB2.podeRealizar(atleta2)}")
    println("[${atleta2.nome}]: ProvaB3 - ${provaB3.podeRealizar(atleta2)}")
}