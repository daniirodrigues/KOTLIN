fun main() {
    val frutas = mutableListOf("Morango", "Banana", "Abacaxi", "Uva", "Manga")

    println("Sua lista de compras: $frutas")

    while (frutas.isNotEmpty()) {
        print("Digite o nome de uma fruta para remover: ")
        val entrada = readlnOrNull() ?: ""

        if (frutas.contains(entrada)) {
            frutas.remove(entrada)
            println("Fruta foi retirada da lista.")
        } else {
            println("Fruta indisponível no nosso mercado.")
        }

        if (frutas.isNotEmpty()) {
            println("Itens restantes: $frutas")
        }
    }

    println("Lista de compras finalizada")
}
