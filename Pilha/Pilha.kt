class Pilha: Empilhavel {
    private val elementos: Array<Any?>
    private var indice: Int
    constructor(tamanho: Int = 10) {
        elementos = arrayOfNulls(tamanho)
        indice = -1
    }

    override fun estaCheia(): Boolean {
        return indice == elementos.size - 1
    }

    override fun estaVazia(): Boolean {
        return indice ==  -1
    }

    override fun desempilhar(): Any? {
            var aux: Any? = null
        if (!estaCheia()) aux = elementos[indice]
       indice--
        return aux
    }

    override fun atualizar(value: Any?) {
            if (!estaVazia()) {
            elementos[indice] = value;
          } else {
            println("Stack is empty")
        }
    }

    override fun empilhar(value: Any?) {
            if (!estaCheia()) {
            indice++
            elementos[indice] = value;
        } else {
            println("Stack is full")
        }
    }

    fun imprimir(): String {
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
}
