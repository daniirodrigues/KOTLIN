fun main() {

    println("Digite o primeiro número:")
    val num1 = readln().toInt()

    println("Digite o segundo número:")
    val num2 = readln().toInt()


    println("Escolha a operação:")
    println("1. Adição")
    println("2. Subtração")
    println("3. Divisão")
    println("4. Multiplicação")

    val operacao = readln().toInt()


    when (operacao) {
        1 -> {
            val resultado = num1 + num2
            println("Resultado da Adição: $resultado")
        }
        2 -> {
            val resultado = num1 - num2
            println("Resultado da Subtração: $resultado")
        }
        3 -> {
           
            if (num2 != 0) {
                val resultado = num1.toDouble() / num2
                println("Resultado da Divisão: $resultado")
            } else {
                println("Erro: Não é possível dividir por zero.")
            }
        }
        4 -> {
            val resultado = num1 * num2
            println("Resultado da Multiplicação: $resultado")
        }
        else -> println("Operação inválida.")
    }
}