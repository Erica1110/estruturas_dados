interface Empilhavel {
    // CRUD
    fun empilhar(dado: Any)
    fun desempilhar(): Any?

    // Métodos auxiliares
    fun estaCheia(): Boolean
    fun estaVazia(): Boolean
    fun espiar(): Any?
    fun imprimir(): String
    fun atualizar(dado: Any)
}