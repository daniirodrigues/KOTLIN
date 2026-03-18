fun main() {
    println("Informe um valor: ")
    val valor1 = readln().toDouble()

    println("Informe outro valor: ")
    var valor2 = readln().toDouble()


    while (valor2 <= 0) {
        println("Valor inválido! O divisor deve ser maior que ZERO.")
        print("Digite um novo valor para o divisor: ")
        valor2 = readln().toDouble()
    }

    val resultado = valor1 / valor2
    println("O resultado da divisão é: $resultado")
}