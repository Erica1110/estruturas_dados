class main() {
    var heap: Amontoavel = ArvoreBinariaHeapMaximo(10)
    heap.inserir(3)
    heap.inserir(5)
    heap.inserir(2)
    heap.inserir(0)
    heap.atualizar(6)
    heap.inserir(4)
    println(heap.imprimir())
    println(heap.extrair())
    println(heap.obter())
    println(heap.obter())
    println(heap.imprimir())
}