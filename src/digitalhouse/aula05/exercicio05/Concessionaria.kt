package digitalhouse.aula05.exercicio05

class Concessionaria{
    var vendas = arrayListOf<Venda>()

    fun registrarVenda(veiculo: Veiculo, cliente: Cliente, valor: Double) {
        vendas.add(Venda(cliente, veiculo, valor))
    }
}