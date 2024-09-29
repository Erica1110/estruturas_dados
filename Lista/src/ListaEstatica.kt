class ListaEstatica(tamanho: Int) : Listavel {
    private var ponteiroInicio: Int = 0
    private var ponteiroFim: Int = -1
    private var quantidade: Int = 0
    private val dados: Array<Any?> = arrayOfNulls(tamanho)

    override fun imprimir(): String {
        var resultado = "["
        var ponteiroAux = ponteiroInicio
        for (i in 0 until quantidade) {
            resultado += if (i == quantidade - 1)
                "${dados[(ponteiroAux + i) % dados.size]}"
            else
                "${dados[(ponteiroAux + i) % dados.size]},"
        }
        return "$resultado]"
    }

    override fun anexar(dado: Any?) {
        if (!estaCheia()) {
            ponteiroFim = (ponteiroFim + 1) % dados.size
            dados[ponteiroFim] = dado
            quantidade++
        } else {
            println("List is full!")
        }
    }

    override fun estaCheia(): Boolean {
        return (quantidade == dados.size)
    }

    override fun estaVazia(): Boolean {
        return (quantidade == 0)
    }

    override fun limpar(): Boolean {
        ponteiroInicio = 0
        ponteiroFim = -1
        quantidade = 0
        return true
    }

    override fun selecionar(posicao: Int): Any? {
        if (!estaVazia() && posicao in 0 until quantidade) {
            return dados[(ponteiroInicio + posicao) % dados.size]
        }
        println("Índice inválido ou lista está vazia!")
        return null
    }

    override fun selecionarTodos(): Array<Any?> {
        return Array(quantidade) { dados[(ponteiroInicio + it) % dados.size] }
    }

    override fun atualizar(posicao: Int, dado: Any) {
        if (!estaVazia() && posicao in 0 until quantidade) {
            dados[(ponteiroInicio + posicao) % dados.size] = dado
        } else {
            println("Índice não válido ou lista está vazia!")
        }
    }

    override fun apagar(posicao: Int): Any? {
        if (!estaVazia() && posicao in 0 until quantidade) {
            val posicaoFisica = (ponteiroInicio + posicao) % dados.size
            val dadoAux = dados[posicaoFisica]
            for (i in posicao until (quantidade - 1)) {
                val atual = (ponteiroInicio + i) % dados.size
                val proximo = (atual + 1) % dados.size
                dados[atual] = dados[proximo]
            }
            ponteiroFim = (ponteiroFim - 1 + dados.size) % dados.size
            quantidade--
            return dadoAux
        }
        println("Índice inválido ou lista está vazia!")
        return null
    }

    override fun inserir(posicao: Int, dado: Any?) {
        if (!estaCheia() && posicao in 0..quantidade) {
            for (i in quantidade downTo posicao) {
                val atual = (ponteiroInicio + i) % dados.size
                val anterior = (ponteiroInicio + i - 1 + dados.size) % dados.size
                dados[atual] = dados[anterior]
            }
            dados[(ponteiroInicio + posicao) % dados.size] = dado
            ponteiroFim = (ponteiroFim + 1) % dados.size
            quantidade++
        } else {
            println("Lista cheia ou índice inválido!")
        }
    }
}