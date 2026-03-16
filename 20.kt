fun main() {
    println("Olá seja bem vindo, Digite sua altura: ")
    val altura = readln().toDoubleOrNull()

    println("Digite seu genero: (1 para Feminino, 2 para Masculino): ")
    val genero = readln().toIntOrNull()

    if (altura != null && genero != null) {
        if (genero == 1) {
            val peso = (62.1 * altura) - 44.7
            println("Peso ideal (Feminino): %.2f kg".format(peso))
        }
        else if (genero == 2) {
            val peso = (72.7 * altura) - 58.0
            println("Peso ideal (Masculino): %.2f kg".format(peso))
        }
        else {
            println("Código de gênero inválido!")
        }
    } else {
        println("Erro: Digite apenas números válidos!")
    }
}