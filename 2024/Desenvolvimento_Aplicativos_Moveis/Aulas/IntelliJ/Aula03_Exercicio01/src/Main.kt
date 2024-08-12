fun main() {
    var precoOriginal : Double = 0.00
    var porcentagemDesconto : Double = 0.00
    var desconto : Double
    var precoFinal : Double

    do {
        print("Digite o preço original do produto (0 para finalizar): ")
        precoOriginal = readLine()!!.toDouble()

        if (precoOriginal > 0) {
            print("Digite a porcentagem de desconto: ")
            porcentagemDesconto = readLine()!!.toDouble()

            desconto = precoOriginal * (porcentagemDesconto / 100)
            precoFinal = precoOriginal - desconto

            println("O preço final com desconto é: R$ $precoFinal")
        }
    } while (precoOriginal > 0)
}