fun main() {
    var precoOriginal : Double
    var porcentagemDesconto : Double

    do {
        precoOriginal = getValor("Digite o preço original do produto (0 para finalizar):")

        if (precoOriginal > 0) {
            porcentagemDesconto = getValor("Digite a porcentagem de desconto: ")
            informaDesconto(precoOriginal, porcentagemDesconto, "O preço final com desconto é: R$ ")
        }
    } while (precoOriginal > 0)
}
fun getValor(msg : String) : Double {
    print(msg)
    return readLine()!!.toDouble()
}
fun informaDesconto(precoVlr : Double, porcentualVlr : Double, msg : String) {
    println(msg + " ${ precoVlr - (precoVlr * (porcentualVlr / 100))}")
}