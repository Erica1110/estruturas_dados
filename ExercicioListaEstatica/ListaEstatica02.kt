class ListaEstatica(val tamanho: Int) : Listavel {
    private var dados: Array<Any?> = arrayOfNulls(tamanho)
    private var quantidade = 0
    private var ponteiroInicio = 0
    private var ponteiroFim = -1

    // Verifica se a lista está cheia
    override fun estaCheia(): Boolean {
        return quantidade == tamanho
    }

    // Verifica se a lista está vazia
    override fun estaVazia(): Boolean {
        return quantidade == 0
    }

    // Avança uma posição circular
    private fun avancar(posicao: Int): Int {
        return (posicao + 1) % tamanho
    }

    // Retrocede uma posição circular
    private fun retroceder(posicao: Int): Int {
        return (posicao - 1 + tamanho) % tamanho
    }
    //inserir (C)
    // Insere um dado no início da lista
    override fun inserirInicio(dado: Any?): Boolean {
        if (!estaCheia()) {
            ponteiroInicio = retroceder(ponteiroInicio)
            dados[ponteiroInicio] = dado
            quantidade++
            if (ponteiroFim == -1) {
                ponteiroFim = ponteiroInicio
            }
            return true // Sucesso na inserção
        }
        return false // Lista cheia
    }

    // Insere um dado no fim da lista
    override fun inserirFim(dado: Any?): Boolean {
        if (!estaCheia()) {
            ponteiroFim = avancar(ponteiroFim)
            dados[ponteiroFim] = dado
            quantidade++
            return true
        }
        return false
    }

    // Insere um dado em uma posição específica da lista
    override fun inserirPosicaoEspecifica(posicao: Int, dado: Any?): Boolean {
        if (!estaCheia() && posicao in 0 until quantidade) {
            val posicaoFisica = (ponteiroInicio + posicao) % tamanho
            var atual = ponteiroFim
            for (i in quantidade downTo posicao + 1) {
                dados[(atual + 1) % tamanho] = dados[atual]
                atual = retroceder(atual)
            }
            dados[posicaoFisica] = dado
            ponteiroFim = avancar(ponteiroFim)
            quantidade++
            return true
        }
        return false
    }
    //ler(R)
    // Busca o dado no início da lista
    override fun buscarDadoInicio(): Any? {
        return if (!estaVazia()) dados[ponteiroInicio] else null
    }

    // Busca o dado no fim da lista
    override fun buscarDadoFim(): Any? {
        return if (!estaVazia()) dados[ponteiroFim] else null
    }

    // Busca o dado em uma posição específica da lista
    override fun buscarDadoPosicaoEspecifica(posicao: Int): Any? {
        return if (!estaVazia() && posicao in 0 until quantidade) {
            dados[(ponteiroInicio + posicao) % tamanho]
        } else null
    }

    // Busca todos os dados da lista e os retorna em um array
    override fun buscarTodos(): Array<Any?> {
        val resultado = arrayOfNulls<Any?>(quantidade)
        if (!estaVazia()) {
            var ponteiroAux = ponteiroInicio
            for (i in 0 until quantidade) {
                resultado[i] = dados[ponteiroAux]
                ponteiroAux = avancar(ponteiroAux)
            }
        }
        return resultado
    }

    // Verifica a primeira ocorrência de um dado
    override fun verificarPrimeiraOcorrencia(dado: Any?): Int {
        if (!estaVazia()) {
            var ponteiroAux = ponteiroInicio
            for (i in 0 until quantidade) {
                if (dados[ponteiroAux] == dado) return i
                ponteiroAux = avancar(ponteiroAux)
            }
        }
        return -1 // Não encontrado
    }

    // Verifica a última ocorrência de um dado
    override fun verificarUltimaOcorrencia(dado: Any?): Int {
        if (!estaVazia()) {
            var ponteiroAux = ponteiroFim
            for (i in quantidade - 1 downTo 0) {
                if (dados[ponteiroAux] == dado) return i
                ponteiroAux = retroceder(ponteiroAux)
            }
        }
        return -1
    }
    //atualizar(U)
    // Atualiza o dado no início da lista
    override fun atualizarDadoInicio(dado: Any?): Boolean {
        if (!estaVazia()) {
            dados[ponteiroInicio] = dado
            return true
        }
        return false
    }

    // Atualiza o dado no fim da lista
    override fun atualizarDadoFim(dado: Any?): Boolean {
        if (!estaVazia()) {
            dados[ponteiroFim] = dado
            return true
        }
        return false
    }

    // Atualiza um dado em uma posição específica da lista
    override fun atualizarPosicaoLogica(posicao: Int, dado: Any?): Boolean {
        if (!estaVazia() && posicao in 0 until quantidade) {
            val posicaoFisica = (ponteiroInicio + posicao) % tamanho
            dados[posicaoFisica] = dado
            return true
        }
        return false
    }

    // Atualiza todos os dados da lista
    override fun atualizarTodosDados(dado: Any?): Boolean {
        if (!estaVazia()) {
            var ponteiroAux = ponteiroInicio
            for (i in 0 until quantidade) {
                dados[ponteiroAux] = dado
                ponteiroAux = avancar(ponteiroAux)
            }
            return true
        }
        return false
    }
    //apagar(D)
    // Remove e retorna o dado do início da lista
    override fun apagarDadoInicio(): Any? {
        if (!estaVazia()) {
            val dadoAux = dados[ponteiroInicio]
            ponteiroInicio = avancar(ponteiroInicio)
            quantidade--
            return dadoAux // Dado removido
        }
        return null
    }

    // Remove e retorna o dado do fim da lista
    override fun apagarDadoFim(): Any? {
        if (!estaVazia()) {
            val dadoAux = dados[ponteiroFim]
            ponteiroFim = retroceder(ponteiroFim)
            quantidade--
            return dadoAux
        }
        return null
    }

    // Remove e retorna o dado de uma posição específica da lista
    override fun apagarDadoPosicaoLogica(posicao: Int): Any? {
        if (!estaVazia() && posicao in 0 until quantidade) {
            val posicaoFisica = (ponteiroInicio + posicao) % tamanho
            val dadoAux = dados[posicaoFisica]
            var atual = posicaoFisica
            for (i in posicao until quantidade - 1) {
                dados[atual] = dados[avancar(atual)]
                atual = avancar(atual)
            }
            ponteiroFim = retroceder(ponteiroFim)
            quantidade--
            return dadoAux
        }
        return null
    }

    // Remove todos os dados da lista e os retorna em um array
    override fun apagarTodosOsDados(): Array<Any?> {
        val dadosAux = arrayOfNulls<Any>(quantidade)
        if (!estaVazia()) {
            var ponteiroAux = ponteiroInicio
            for (i in 0 until quantidade) {
                dadosAux[i] = dados[ponteiroAux]
                ponteiroAux = avancar(ponteiroAux)
            }
            quantidade = 0
            ponteiroInicio = 0
            ponteiroFim = -1
        }
        return dadosAux
    }
    //ordenar(S)
    // Ordena os dados em ordem crescente
    override fun ordenarCrescente(): Boolean {
        if (!estaVazia()) {
            for (i in 0 until quantidade - 1) {
                for (j in 0 until quantidade - 1 - i) {
                    val p1 = (ponteiroInicio + j) % tamanho
                    val p2 = (ponteiroInicio + j + 1) % tamanho
                    if ((dados[p1] as Int) > (dados[p2] as Int)) {
                        val temp = dados[p1]
                        dados[p1] = dados[p2]
                        dados[p2] = temp
                    }
                }
            }
            return true
        }
        return false
    }

    // Inverte os dados da lista
    override fun inverterDados(): Boolean {
        if (!estaVazia()) {
            var ponteiroAuxInicio = ponteiroInicio
            var ponteiroAuxFim = ponteiroFim
            for (i in 0 until quantidade / 2) {
                val temp = dados[ponteiroAuxInicio]
                dados[ponteiroAuxInicio] = dados[ponteiroAuxFim]
                dados[ponteiroAuxFim] = temp
                ponteiroAuxInicio = avancar(ponteiroAuxInicio)
                ponteiroAuxFim = retroceder(ponteiroAuxFim)
            }
            return true
        }
        return false
    }
}