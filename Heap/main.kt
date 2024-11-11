fun main() {
    var heap: Amontoavel = ArvoreBinariaHeapMinimo(10)
    heap.inserir(5)
    heap.atualizar(0)
    heap.inserir(1)
    println(heap.imprimir())
    println(heap.extrair())
    println(heap.obter())
}