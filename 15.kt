fun main () {
    //  Faça um programa que leia 6 valores informados pelo usuário, calcule, exiba os números informados e escreva a média aritmética desses valores lidos.

    println("Informe primeiro valor: ")
    val nm1 = readln().toDouble()

    println("Informe segundo valor: ")
    val nm2 = readln().toDouble()

    println("Informe terceiro valor: ")
    val nm3 = readln().toDouble()

    println("Informe quarto valor: ")
    val nm4 = readln().toDouble()

    println("Informe quinto valor: ")
    val nm5 = readln().toDouble()

    println("Informe sexto valor: ")
    val nm6 = readln().toDouble()

    // Cálculo da Média
    val soma = nm1 + nm2 + nm3 + nm4 + nm5 + nm6
    val media = soma / 6

    println("Os valores informados são: $nm1 $nm2 $nm3 $nm4 $nm5 $nm6")
    println("A média aritmética é: $media")
}