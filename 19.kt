fun main () {
 // Escreva um programa para ler o ano de nascimento de uma pessoa e escrever uma mensagem que diga se ela poderá ou não votar este ano (não é necessário considerar o mês em que ela nasceu).

    val anoAtual = 2026 // Ano definido hoje !!

    println("Olá Digite o ano de seu nascimento: ")
    val Anonascimento = readln().toIntOrNull()

    if (Anonascimento != null) {
        val idade = anoAtual - Anonascimento
        println("Você poder votar esse ano!")
    }
    else {
        println("Você não pode votar esse ano!")
    }
}