fun main() {
    print("Digite uma frase: ")
    val frase = readLine()!!

    val palavras = frase.split(" ")
    val numeroPalavras = palavras.size

    println("Número de palavras na frase: $numeroPalavras")
}