package Arvore

class ArvoreBinariaPesquisa : Arborizavel {
    var raiz: NoTriplo? = null

    override fun inserir(dado: Any?) {
        if(raiz?.dado == null) {
            raiz?.dado = dado
        } else {
            val novoNo = NoTriplo(dado)
            var aux = raiz
            while (aux != null){
                if ((aux.dado as Int) < (dado as Int)) {
                    if (aux.direita != null){
                        aux = aux.direita
                    } else {
                        aux.direita = novoNo
                        novoNo.genitor = aux
                    }
                } else {
                    if (aux.esquerda != null){
                        aux = aux.esquerda
                    } else {
                        aux.esquerda = novoNo
                        novoNo.genitor = aux
                    }
                }
            }
        }
    }

    override fun apagar(dado: Any?): Boolean {
        
    }

    override fun limpar() {
        raiz = noTriplo()
    }

    override fun existe(dado: Any?): Boolean {}

    override fun buscar(dado: Any?): NoTriplo? {}

    override fun preOrdem(): String {}

    override fun emOrdem(): String {}

    override fun posOrdem(): String {}
}
