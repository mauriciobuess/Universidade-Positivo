class Livro(val titulo: String, val autor: String, val anoPublicacao: Int) {
    fun exibirInformacoes() {
        println("Título: $titulo, Autor: $autor, Ano: $anoPublicacao")
    }
}
//------------------
class Biblioteca {
    private val acervo = mutableListOf<Livro>()

    fun adicionarLivro(livro: Livro) {
        acervo.add(livro)
        println("Livro adicionado com sucesso!")
    }

    fun exibirLivros() {
        if (acervo.isEmpty()) {
            println("Nenhum livro cadastrado.")
        } else {
            acervo.forEach { it.exibirInformacoes() }
        }
    }

    fun removerLivro(titulo: String) {
        val livroRemovido = acervo.removeIf { it.titulo.equals(titulo, ignoreCase = true) }
        if (livroRemovido) {
            println("Livro removido com sucesso!")
        } else {
            println("Livro não encontrado.")
        }
    }

    fun totalLivros(): Int {
        return acervo.size
    }
}

//--------------------------
fun main() {
    val biblioteca = Biblioteca()
    while (true) {
        println("Bem-vindo ao Sistema de Gerenciamento de Biblioteca!")
        println("Digite o comando desejado:")
        println("1. Adicionar um novo livro")
        println("2. Exibir todos os livros")
        println("3. Remover um livro pelo título")
        println("4. Mostrar o total de livros disponíveis")
        println("5. Sair")
        print("Escolha uma opção: ")

        when (readLine()) {
            "1" -> {
                print("Digite o título do livro: ")
                val titulo = readLine()!!
                print("Digite o autor do livro: ")
                val autor = readLine()!!
                print("Digite o ano de publicação: ")
                val anoPublicacao = readLine()!!.toInt()

                val novoLivro = Livro(titulo, autor, anoPublicacao)
                biblioteca.adicionarLivro(novoLivro)
            }
            "2" -> biblioteca.exibirLivros()
            "3" -> {
                print("Digite o título do livro a ser removido: ")
                val titulo = readLine()!!
                biblioteca.removerLivro(titulo)
            }
            "4" -> println("Total de livros disponíveis: ${biblioteca.totalLivros()}")
            "5" -> {
                println("Encerrando o programa...")
                break
            }
            else -> println("Opção inválida. Tente novamente.")
        }
        println()
    }
}
