import java.lang.Thread.sleep

fun main() {
    println("Pressione 1 para iniciar a contagem regressiva de 30 segundos...")
    readln()

    for (i in 30 downTo 0) {

        print("\rTempo restante: $i segundos ")
        sleep(1000)
    }

    println("\n\nKABOM!!")
}