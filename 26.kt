fun main() {
    val nm1 = readln().toInt()
    val nm2 = readln().toInt()

    var soma = 0
    var contador = 0

    for (i in nm1..nm2) {
        soma += i
        contador++ // CORRIGIDO: Só soma 1 para contar a quantidade
    }

    val media = soma.toDouble() / contador

    println("O resultado é: $media")
}