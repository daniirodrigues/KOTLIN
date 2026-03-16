fun main () {

    //  Faça um programa que leia um valor informado pelo usuário e diga se o valor informado é positivo, negativo ou zero.

    println("Informe um valor: ")
    var numero = readln().toDouble()

    if (numero > 0) {
        println ("número é positivo")
    }
    else if (numero < 0) {
        println ("O número é negativo")
    }
   else {
       println("O número é zero")
    }

}