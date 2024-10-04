interface Enfileiravel {
    fun enfileirar(dado: Any?)
    fun desenfileirar():Any?
    fun frente():Any?
    fun atualizar(dado: Any?)

    fun imprimir(): String
    fun estaCheia(): Boolean
    fun estaVazia(): Boolean
}