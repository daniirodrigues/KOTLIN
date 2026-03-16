fun main() {
    println("--- CÁLCULO DA ÁREA DO CÍRCULO ---")

    print("Digite o valor do raio (r): ")
    val raio = readln().toDouble()

    val pi = 3.14

    val area = pi * (raio * raio)

    println("A área do círculo é: $area")
}