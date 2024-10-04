fun main(){
    val f1 = Fila(9)

    f1.enfileirar(9)
    f1.enfileirar(10)
    println(f1.imprimir())
    f1.atualizar(8)
    println(f1.imprimir())
}