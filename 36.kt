fun main() {
    val frutas = mutableListOf("Morango", "Banana", "Abacaxi", "Uva", "Manga")

    println("Bem-vindo ao mercado!")

    while (frutas.isNotEmpty()) {
        println("\nSua lista de compras atual: $frutas")
        print("Digite o nome de uma fruta para remover: ")

        val itemInformado = readlnOrNull()?.replaceFirstChar { it.uppercase() } ?: ""

        if (frutas.contains(itemInformado)) {
            frutas.remove(itemInformado)
            println("Fruta foi retirada da lista.")
        } else {
            println("Fruta indisponível no nosso mercado.")
        }
    }

    println("\nLista de compras finalizada.")
}