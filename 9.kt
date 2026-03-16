fun main () {
    println("--- CÁLCULO DA ÁREA DO TRIANGULO ---")

   println("Digite o valor da Base: ")
    val base = readln().toDouble()

    println("Digite o valor da Altura:")
    val altura = readln().toDouble()

    val area = base * altura / 2

    println ("A área total do triângulo é $area")
}