fun main() {
    var dentro = 0
    var fora = 0

    println("Manda aí 10 números (aperta Enter depois de cada um):")

    for (i in 1..10) {
        val num = readln().toInt()

        // O 'in' é o pulo do gato pra checar o intervalo [24..42]
        if (num in 24..42) {
            dentro++
        } else {
            fora++
        }
    }

    println("Resultado:")
    println("No intervalo: $dentro")
    println("Fora dele: $fora")
}