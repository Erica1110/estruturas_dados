fun main() {
        val lista = ListaEstatica(5)

        // Testando inserções
        println("Inserir 10 no fim: ${lista.inserirFim(10)}") // true
        println("Inserir 20 no fim: ${lista.inserirFim(20)}") // true
        println("Inserir 5 no início: ${lista.inserirInicio(5)}") // true

        // Testando busca
        val dadoInicio = lista.buscarDadoInicio()
        val dadoFim = lista.buscarDadoFim()

        // Testando remoções
        println("Remover dado do início: ${lista.apagarDadoInicio()}") // 5
        println("Remover dado do fim: ${lista.apagarDadoFim()}") // 20

        // Exibindo resultados
        println("Dado no início: $dadoInicio") // 5
        println("Dado no fim: $dadoFim")       // 20
        println("Lista atual: ${lista.buscarTodos().contentToString()}")
}
