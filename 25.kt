fun main () {
    // Faça um algoritmo que calcule e escreva a média aritmética dos números inteiros entre 15 (inclusive) e 100 (inclusive).}

    var soma = 0
    var contador = 0

    for (i in 15..100) {
        soma += i
        contador ++
    }
    val media = soma.toDouble() / contador

    println("Soma total é: $soma")
    println("A quantidade de número é: $contador")
    println("A media aritimetica é: $media")


}