fun main () {
    println("--- CÁLCULO DA ÁREA DO TRAPÉZIO ---")

    println("Digite a Base Maior:")
    val basemaior = readln().toDouble()

    println("Digite a Base Menor:")
    val basemenor = readln().toDouble()

    println("Digite a altura :")
    val altura = readln().toDouble()

    val area = (basemaior + basemenor) * altura / 2

    println("A área do trapézio é: $area")
}