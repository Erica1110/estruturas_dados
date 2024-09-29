fun main() {
    val lista: Listavel = ListaEstatica(5)  // Define um tamanho para a lista
    lista.anexar("Erica")
    lista.inserir(1, "Meire")
    lista.anexar("Ferreira")
    lista.inserir(2, "Prates")
    println("${lista.imprimir()}")

    lista.apagar(3)
    println("${lista.imprimir()}")

    lista.atualizar(0,"Erika")
    println("${lista.imprimir()}")
}