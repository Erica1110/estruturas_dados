interface Listavel {

    fun estaCheia(): Boolean
    fun estaVazia(): Boolean

        //metodos questao 02:
        //inserir (C)
    fun inserirInicio(dado:Any?): Boolean //boolean para indicar se a insercao foi realmente feita
    fun inserirFim(dado: Any?): Boolean
    fun inserirPosicaoEspecifica(posicao: Int, dado: Any): Boolean
        //ler(R)
    fun buscarDadoInicio(): Any?
    fun buscarDadoFim(): Any?
    fun buscarDadoPosicaoEspecifica(posicao: Int): Any?
    fun buscarTodos(): Array<Any?>
    fun verificarPrimeiraOcorrencia(dado: Any?): Int
    fun verificarUltimaOcorrencia(dado: Any?): Int
        //atualizar(U)
    fun atualizarDadoInicio(dado: Any?): Boolean
    fun atualizarDadoFim(dado: Any?): Boolean
    fun atualizarPosicaoLogica(posicao: Int, dado: Any?): Boolean
    fun atualizarTodosDados(dado: Any?): Boolean
        //apagar(D)
    fun apagarDadoInicio(): Any?
    fun apagarDadoFim(): Any?
    fun apagarDadoPosicaoLogica(posicao: Int): Any?
    fun apagarTodosOsDados(): Array<Any?>
        //ordenar(S)
    fun trocar(p1: Int, p2: Int): Boolean
    fun ordenarCrescente(): Boolean
    fun ordenarDecrescente(): Boolean
    fun inverterDados(): Boolean



}
