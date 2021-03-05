class Pessoa1

class Pessoa2 (var nome: String, val  anoNascimento: Int)

class Pessoa3 (var nome: String, val anoNascimento: Int) {
    fun saudacao () {
        println("Olá, meu nome é $nome")
    }
}
fun main () {
    val pessoa: Pessoa3 = Pessoa3 ("Mario", 1992)
    println(pessoa.nome)
    println(pessoa.anoNascimento)

    pessoa.saudacao()
}