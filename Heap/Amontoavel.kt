public interface Amontoavel {
    fun inserir(dado: Long) 	//C
    fun obter(): Long?			//R
    fun extrair(): Long?		//D
    fun atualizar(dado: Long)	//U

    fun imprimir(): String
    fun estaVazia(): Boolean
    fun estaCheia(): Boolean
}