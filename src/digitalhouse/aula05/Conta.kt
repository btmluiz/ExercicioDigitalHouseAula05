package digitalhouse.aula05

class Conta (
        var numeroDaConta: Int,
        var saldo:Double,
        var titular: Cliente
) {
    fun deposito(valor: Double) {
        saldo += valor
        println("Transação: deposito de R$$valor")
        println("Novo saldo: R$$saldo")
    }

    fun saque(valor: Double){
        println("Transação: saque de R$$valor")
        if (valor > saldo){
            println("Saldo insuficiente")
        } else {
            saldo -= valor
            println("Novo saldo: R$$saldo")
        }
    }
}