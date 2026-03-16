fun main () {
    // Faça um programa para ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles.

    println ("Digite o primeiro valor: ")
    var nm1 = readln().toDouble()

    println ("Digite o segundo valor: ")
    var nm2 = readln().toDouble()

    println ("Digite o ultimo valor: ")
    var nm3 = readln().toDouble()

    if (nm1 > nm2 && nm3 > nm1 ) {
        println ("O maior número é $nm1")
    }
    else if (nm2 > nm1 && nm2 > nm3 ) {
        println ("O maior número é $nm2")
    }
    else {
        println ("O maior número é $nm3")
    }
}