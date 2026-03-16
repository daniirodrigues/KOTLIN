fun main () {

    //  Faça um programa que receba quatro valores informados pelo usuário, mas informe somente o primeiro, o último e o maior de todos eles (considere que todos os números inentes) iformados serão difer

    println ("Informe o primeiro valor: ")
    val nm1 = readln().toDouble()

    println("Informe o segundo valor: ")
    val nm2 = readln().toDouble()

    println("Informe o terceiro valor: ")
    val nm3 = readln().toDouble()

    println("Informe o quarto valor: ")
    val nm4 = readln().toDouble()

    var maior = nm1

    if (nm2 > maior) {
        maior = nm2
    }
    if (nm3 > maior) {
        maior = nm3
    }
    if (nm4 > maior) {
        maior = nm4
    }
    println("Primeiro informado: $nm1")
    println("O ultimo informado: $nm4")
    println("O maior de todos eles: $maior")

}
