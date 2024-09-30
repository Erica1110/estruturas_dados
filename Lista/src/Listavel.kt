interface Listavel {

        //metodos principais
        fun inserir(posicao: Int, dado: Any?)    //ordem de complexidade(n)
        fun anexar(dado: Any?)                   //ordem de complexidade(n)
        fun selecionar(posicao: Int): Any?      //ordem de complexidade(1)
        fun selecionarTodos(): Array<Any?>      //ordem de complexidade(n)
        fun atualizar(posicao: Int, dado: Any)  //ordem de complexidade(1)
        fun apagar(posicao: Int): Any?          //ordem de complexidade(n)
        fun limpar(): Boolean                   //ordem de complexidade(1)

        //metodos extras
        //fun inserirInicio(dado: Any)
        //fun selecionarInicia(): Any?
        //fun atualizarFim(dado: Any)

        //metodos auxiliares
        fun imprimir(): String
        fun estaCheia(): Boolean
        fun estaVazia(): Boolean
}
