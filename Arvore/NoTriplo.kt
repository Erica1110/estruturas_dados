package Arvore

data class NoTriplo(var dado: Any? = null) {

    var esquerda: NoTriplo? = null
    var direita: NoTriplo? = null
    var genitor: NoTriplo? = null
}
