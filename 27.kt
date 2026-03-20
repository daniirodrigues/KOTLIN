fun main() {
    var aprovados = 0 

    do {

        println("Digite a primeira nota:")
        val nota1 = readln().toDouble()

        println("Digite a segunda nota:")
        val nota2 = readln().toDouble()


        val media = (nota1 + nota2) / 2
        println("A média final é: $media")


        if (media >= 9.5) {
            println("Aluno APROVADO!")
            aprovados++ //
        } else {
            println("Aluno REPROVADO.")
        }
        
        println("Calcular a média de outro aluno Sim/Não? (S/N)")
        val resposta = readln().uppercase()

    } while (resposta == "S")


    println("Programa encerrado.")
    println("Quantidade de alunos aprovados: $aprovados")
}
