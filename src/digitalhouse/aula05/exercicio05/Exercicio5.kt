package digitalhouse.aula05.exercicio05

fun main() {
    val carroA = Veiculo("Chevrolet", "Onix", 2018, "Branco", 10000)
    val clienteA = Cliente("Maria", "José", "mariajoseboladona@gmail.com")

    val concessionaria = Concessionaria()

    concessionaria.registrarVenda(carroA, clienteA, 26000.0)
    concessionaria.registrarVenda(carroA, clienteA, 25000.0)
    concessionaria.registrarVenda(carroA, clienteA, 22000.0)
    concessionaria.registrarVenda(carroA, clienteA, 21000.0)

    for (venda in concessionaria.vendas){
        println("Venda no valor de: ${venda.valorVenda} para ${venda.cliente.nome}")
    }
}