fun main () {
    // Faça um programa que leia 3 valores informados pelo usuário (considere que não serão informados valores iguais) e escrever a soma dos 2 maiores.

    println("Informe o primeiro valor: ")
    var val1 = readln().toDouble()

    println("Informe o segundo valor: ")
    var val2 = readln().toDouble()

    println("Informe o terceiro valor: ")
    var val3 = readln().toDouble()

    // Se o val1 for o menor de todos:
    if (val1 < val2 && val1 < val3) {
        val soma = val2 + val3
        println("O valor de soma $soma: ")
    }
    // Se o val2 for menor de todos:
    else if (val2 < val3 && val2 < val1) {
        val soma = val1 + val2
        println("O valor de soma $soma: ")
    }
    // Se o val3 for menor de todos:
    else if (val3 < val1 && val3 < val2) {
        val soma = val1 + val2
        println("O valor de soma $soma: ")
    }

}