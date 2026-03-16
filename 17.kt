fun main () {
    // Faça um programa que leia 6 números que o usuário vai informar. Todos os números lidos com valor inferior a 72 devem ser somados. Escreva o valor final da soma efetuada e também todos valores que o usuário informou.

    println("Digite primeiro número: ")
    val nm1 = readln().toDouble()

    println("Digite segundo número: ")
    val nm2 = readln().toDouble()

    println("Digite terceiro número: ")
    val nm3 = readln().toDouble()

    println("Digite quarto número: ")
    val nm4 = readln().toDouble()

    println("Digite quinto número: ")
    val nm5 = readln().toDouble()

    println("Digite sexto número: ")
    val nm6 = readln().toDouble()

    var soma = 0.0

    if (nm1 < 72) {
        soma = soma + nm1
    }

    if (nm2 < 72) {
        soma = soma + nm2
    }

    if (nm3 < 72) {
        soma = soma + nm3
    }

    if (nm4 < 72) {
        soma = soma + nm4
    }

    if (nm5 < 72) {
        soma = soma + nm5
    }

    if (nm6 < 72) {
        soma = soma + nm6
    }

    //  Exibindo os resultados
    println("Números informados: $nm1, $nm2, $nm3, $nm4, $nm5, $nm6")
    println("A soma dos valores são $soma")


}
