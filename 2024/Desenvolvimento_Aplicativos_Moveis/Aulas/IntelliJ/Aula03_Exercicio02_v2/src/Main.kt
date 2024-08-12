fun main() {
    print("Digite uma frase: ")
    val frase = readLine()!!
    val contaPalavras = contaPalavras(frase, true)
    println("Conteúdo de [contaPalavras]-> $contaPalavras")

}
fun contaPalavras(frase : String, isMostraMsg : Boolean = false) : Int {
    val totalPalavras = frase.split(" ").size
    if (isMostraMsg) {
        println("Número de palavras na frase: $totalPalavras")
    }
    return totalPalavras
}