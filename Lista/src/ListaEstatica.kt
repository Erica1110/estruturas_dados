class ListaEstatica : Listavel {
    private var ponteiroInicio: Int
    private var ponteiroFim: Int
    private var quantidade: Int
    private val dados: Array<Any?>

    constructor(tamanho: Int) {
        ponteiroInicio = 0
        ponteiroFim = -1
        quantidade = 0
        dados = arrayOfNulls(tamanho)
    }

    override fun imprimir(): String {

    }

    override fun estaCheia(): Boolean {
        return (quantidade == dados.size)
    }

    override fun estaVazia(): Boolean {
       return (quantidade == dados.size)
    }

    override fun limpar(): Boolean {
        ponteiroInicio = 0
        ponteiroFim = -1
        quantidade = 0
    }

    override fun selecionar(posicao: Int){}
    override fun selecionarTodos(): Array<Any?>{}
    override fun atualizar(posicao: Int, dado: Any) {
        if (!estaVazia()) {
            if (posicao <= 0)
        }
    }




}