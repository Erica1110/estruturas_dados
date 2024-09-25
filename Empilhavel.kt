interface Empilhavel<T> {
    //'T' é uma variavel do tipo generico, pode ser qualquer tipo
    fun empilhar(dado: T)
    fun desempilhar(): T?
    fun espiar(): T?
    fun atualizar(dado: T)

    fun estaCheia(): Boolean
    fun estaVazia(): Boolean
    fun imprimir(): String
}


//Any representa qualquer tipo de objeto
