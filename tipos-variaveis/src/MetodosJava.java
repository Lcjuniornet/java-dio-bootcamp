public class MetodosJava {
    // === CÓDIGO 1: Método Simples Sem Retorno ===
    public static void saudacao() {
        System.out.println("Olá, seja bem-vindo!");
    }

    public static void main(String[] args) {
        saudacao(); // Chamando o método
    }
}


/*
==================================================
== CÓDIGO 2: Método Com Retorno
==================================================

public class MetodoComRetorno {
    public static int somar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int resultado = somar(5, 3);
        System.out.println("Resultado da soma: " + resultado);
    }
}

==================================================
== CÓDIGO 3: Método Com Parâmetro e Sem Retorno
==================================================

public class MetodoComParametro {
    public static void exibirMensagem(String nome) {
        System.out.println("Olá, " + nome + "!");
    }

    public static void main(String[] args) {
        exibirMensagem("Luiz");
    }
}

==================================================
== CÓDIGO 4: Método Com Sobrecarga (Overload)
==================================================

public class MetodoOverload {
    public static void exibir(int valor) {
        System.out.println("Número inteiro: " + valor);
    }

    public static void exibir(String texto) {
        System.out.println("Texto: " + texto);
    }

    public static void main(String[] args) {
        exibir(42);
        exibir("ChatGPT");
    }
}
*/
