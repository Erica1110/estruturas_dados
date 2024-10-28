interface Empilhavel<T> {
    fun empilhar(dado: T)
    fun desempilhar(): T?
    fun espiar(): T?
    fun atualizar(dado: T)

    fun estaCheia(): Boolean
    fun estaVazia(): Boolean
    fun imprimir(): String
}
