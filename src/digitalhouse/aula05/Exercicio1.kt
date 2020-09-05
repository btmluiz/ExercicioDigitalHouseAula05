package digitalhouse.aula05

fun main(){
    val cliente1 = Cliente("Joao", "Felipe")
    val cliente2 = Cliente("Vitoria", "Gonçalves")

    val conta1 = Conta(1, 2600.13, cliente1)
    val conta2 = Conta(2, 1856.04, cliente2)

    conta1.deposito(1.0)
    conta1.saque(2601.14)

    conta2.deposito(3420.0)
    conta2.saque(1000.0)
}