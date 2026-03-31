import kotlin.system.exitProcess

var dinheiroConta = 100.5f
var usuario = ""
val senhaConta = "3589"

val listaExtrato = mutableListOf(
    "Mercado Extra                 - R$ 45,00",
    "PIX recebido                 + R$ 200,00",
    "Farmácia Drogasil            - R$ 32,50",
    "Compra Americanas            - R$ 78,90\n"
)

fun main() {
    println("=== SISTEMA BANCÁRIO ===")
    print("Digite seu nome: ")
    usuario = readln()

    println("Bem-vindo, $usuario!")
    mostrarMenu()
}

fun mostrarMenu() {
    println("\nEscolha uma opção:")
    println("1 - Saldo")
    println("2 - Extrato")
    println("3 - Sacar")
    println("4 - Depositar")
    println("5 - Transferir")
    println("6 - Encerrar")

    print("Opção: ")
    tratarOpcao()
}

fun tratarOpcao() {
    val opcao = readln().toIntOrNull()

    when (opcao) {
        1 -> consultarSaldo()
        2 -> consultarExtrato()
        3 -> sacarValor()
        4 -> depositarValor()
        5 -> transferirValor()
        6 -> finalizar()
        else -> {
            println("Opção inválida!")
            mostrarMenu()
        }
    }
}

fun checarSenha(): Boolean {
    print("Digite sua senha: ")
    val tentativa = readln()

    return if (tentativa == senhaConta) {
        true
    } else {
        println("Senha incorreta!")
        false
    }
}

fun consultarSaldo() {
    if (!checarSenha()) {
        consultarSaldo()
        return
    }

    println("Saldo disponível: R$ ${"%.2f".format(dinheiroConta)}")
    mostrarMenu()
}

fun consultarExtrato() {
    if (!checarSenha()) {
        consultarExtrato()
        return
    }

    println("\n--- EXTRATO ---")
    listaExtrato.forEach { println(it) }
    println("Saldo: R$ ${"%.2f".format(dinheiroConta)}")

    mostrarMenu()
}

fun depositarValor() {
    print("Valor para depósito: R$ ")
    val valor = readln().toFloatOrNull()

    if (valor == null) {
        println("Digite um valor válido!")
        depositarValor()
        return
    }

    if (valor <= 0) {
        println("Valor inválido!")
        mostrarMenu()
        return
    }

    dinheiroConta += valor
    listaExtrato.add("Depósito                     + R$ ${"%.2f".format(valor)}")

    println("Depósito realizado!")
    mostrarMenu()
}

fun sacarValor() {
    if (!checarSenha()) {
        sacarValor()
        return
    }

    print("Valor para saque: R$ ")
    val valor = readln().toFloatOrNull()

    if (valor == null) {
        println("Digite um valor válido!")
        sacarValor()
        return
    }

    if (valor <= 0 || valor > dinheiroConta) {
        println("Operação não permitida!")
        mostrarMenu()
        return
    }

    dinheiroConta -= valor
    listaExtrato.add("Saque                        - R$ ${"%.2f".format(valor)}")

    println("Saque realizado!")
    mostrarMenu()
}

fun transferirValor() {
    if (!checarSenha()) {
        transferirValor()
        return
    }

    print("Conta destino: ")
    val contaDestino = readln().toIntOrNull()

    if (contaDestino == null) {
        println("Conta inválida!")
        transferirValor()
        return
    }

    print("Valor da transferência: R$ ")
    val valor = readln().toFloatOrNull()

    if (valor == null) {
        println("Digite um valor válido!")
        transferirValor()
        return
    }

    if (valor <= 0 || valor > dinheiroConta) {
        println("Transferência não permitida!")
        mostrarMenu()
        return
    }

    dinheiroConta -= valor
    listaExtrato.add("Transferência ($contaDestino) - R$ ${"%.2f".format(valor)}")

    println("Transferência feita com sucesso!")
    mostrarMenu()
}

fun finalizar() {
    print("Deseja realmente sair? (S/N): ")
    val resposta = readln().uppercase()

    if (resposta == "S") {
        println("Até mais, $usuario!")
        exitProcess(0)
    } else {
        mostrarMenu()
    }
}