//fila
class Fila(private val tamanho: Int = 10): Enfileiravel{
    private var ponteiroInicio = 0
    private var ponteiroFim = -1
    private var fila: Array<Any?> = arrayOfNulls(tamanho)

    override fun estaCheia(): Boolean {
        return (ponteiroFim == fila.size -1)
    }

    override fun estaVazia(): Boolean {
        return (ponteiroInicio == ponteiroFim +1)
    }

    override fun enfileirar(dado: Any?){
        if(!estaCheia()){
            ponteiroFim++
            fila[ponteiroFim] = dado
        } else {
            println("Fila está cheia!")
        }
    }

    override fun desenfileirar(): Any? {
        var aux: Any? = null
        if(!estaVazia()){
            aux = fila[ponteiroInicio]
            ponteiroInicio++
        } else {
            println("Fila está vazia!")
        }
        return aux
    }

    override fun frente():Any?{
        var aux: Any? = null
        if(!estaVazia()){
            aux = fila[ponteiroInicio]
        } else {
            println("A fila está vazia!")
        }
        return aux
    }

    override fun imprimir(): String{
        var resultado = "["
        for(i in ponteiroInicio..ponteiroFim){
            if(i == ponteiroFim){
                resultado += "${fila[i]}"
            } else {
                resultado += "${fila[i]},"
            }
        }
        return "$resultado]"
    }

    override fun atualizar(dado: Any?){
        if(!estaVazia()){
            fila[ponteiroInicio] = dado
        } else {
            println("A fila está vazia!")
        }
    }
}

