fun main() {
    val planetas = arrayOf("Terra", "Marte", "Plutão", "Vênus", "Júpiter", "Saturno")

    val planetaInformado = readln()

    if (planetas.contains(planetaInformado)) {
        println("O planeta $planetaInformado está na lista.")
    } else {
        println("O planeta $planetaInformado não está na lista.")
    }
}