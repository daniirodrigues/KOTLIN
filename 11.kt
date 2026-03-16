fun main () {
    println("Digite o primeiro número: ")
    val nm1 = readln()

    println("Digite o segundo número: ")
    val nm2 = readln()

    if (nm1 > nm2) {
        println("O maior número é $nm1")
    }
    if (nm2 > nm1) {
        println("O maior número é $nm2")
    }
    else {
        println ("Erro Os números são iguais")
    }
}