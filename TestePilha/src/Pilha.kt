class Pilha {
    private val elementos: Array<Any?>
    private var indice: Int // Indica a posição da variável no topo da pilha

    init {
        elementos = arrayOfNulls(tamanho)
        indice = -1
    }

    override fun empilhar(dado: Any) {
        if (!estaCheia()) { // Verificar se a pilha não está cheia
            indice++ // Acrescentar 1 ao valor do índice
            elementos[indice] = dado // Dado é atribuído à posição correspondente ao índice
        } else {
            println("A pilha está cheia!")
        }
    }

    override fun desempilhar(): Any? {
        if (!estaVazia()) { // Verifica se a pilha não está vazia
            val elemento = elementos[indice] // Coloca o elemento que está no topo dentro de "elemento"
            elementos[indice--] = null // Removeu o elemento e atualizou para null
            return elemento
        } else {
            println("A pilha está vazia!")
            return null // Retorna null se a pilha estiver vazia
        }
    }

    // Esta função verifica se o índice está na mesma posição que o último local disponível da lista
    override fun estaCheia(): Boolean {
        return indice == elementos.size - 1
    }

    // Se o índice for igual a -1, significa que a pilha está vazia
    override fun estaVazia(): Boolean {
        return indice == -1
    }

    override fun espiar(): Any? {
        if (!estaVazia()) {
            return elementos[indice]
        } else {
            println("A pilha está vazia!")
            return null // Retorna null se a pilha estiver vazia
        }
    }

    override fun imprimir(): String {
        var retorno = "["
        for (i in indice downTo 0) {
            retorno += if (i == 0) {
                "${elementos[i]}"
            } else {
                "${elementos[i]},"
            }
        }
        return "$retorno]"
    }

    override fun atualizar(dado: Any) {
        if (!estaVazia()) {
            elementos[indice] = dado
        } else {
            println("A pilha está vazia!")
        }
    }
}