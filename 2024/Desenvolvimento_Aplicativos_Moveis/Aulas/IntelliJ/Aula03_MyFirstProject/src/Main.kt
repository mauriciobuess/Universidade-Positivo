//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var name : String? = null

    while (name == null) {
        name = getNome("Qual o seu nome?").toString()
    }

    println("Olá, $name !")
}

fun getNome(mensagem : String) : String? {
    println(mensagem)
    return readLine()
}