fun main() {
    var soma = 0.0
    val totalNot = 6


    for (i in 1..totalNot) {
        var notaValida = -1.0

        while (notaValida < 0 || notaValida > 10) {
            println("Digite a nota $i (entre 0 e 10):")
            val entrada = readln().toDouble()

            if (entrada in 0.0..10.0) {
                notaValida = entrada
            } else {
                println("Valor inválido! A nota deve ser de 0 a 10.")
            }
        }

        soma += notaValida
    }

    val media = soma / totalNot
    println("A média final é: $media")
}