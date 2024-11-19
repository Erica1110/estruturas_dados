interface Amontoavel {
    fun inserir(dado: Long) 	//C
    fun extrair(): Long?		//D
    fun obter(): Long?			//R
    fun atualizar(dado: Long)	//U

    fun imprimir(): String
    fun estaVazia(): Boolean
    fun estaCheia(): Boolean
}