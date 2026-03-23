fun main() {
    val estudantes = mutableListOf<String>()

    while (true) {
        val nome = readln()

        if (nome.uppercase() == "PARE") {
            break
        }

        estudantes.add(nome)
    }

    println(estudantes.size)

    for (estudante in estudantes) {
        println(estudante)
    }
}