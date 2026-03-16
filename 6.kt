fun main() {

    println("--- CÁLCULO DA ÁREA DO LOSANGO ---")


    println("Digite a Diagonal Maior:")
    val diagonalmaior = readln().toDouble()

    println("Digite a Diagonal Menor:")
    val diagonalmenor = readln().toDouble()


    val area = diagonalmaior * diagonalmenor /2
    println ("O valor do cálculo da área do losango é: $area²")

}