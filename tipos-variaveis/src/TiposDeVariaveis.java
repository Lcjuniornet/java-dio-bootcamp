public class TiposDeVariaveis {
    public static void main(String[] args) {
        // === CÓDIGO 1: Declaração e Inicialização de Variáveis ===
        int idade = 25;
        double altura = 1.75;
        char sexo = 'M';
        boolean ativo = true;

        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Sexo: " + sexo);
        System.out.println("Ativo: " + ativo);
    }
}


/*
==================================================
== CÓDIGO 2: Variáveis Locais vs Globais
==================================================

public class VariaveisClasse {
    int contador = 10;

    public void mostrarContador() {
        int contador = 5;
        System.out.println("Contador local: " + contador);
        System.out.println("Contador global: " + this.contador);
    }

    public static void main(String[] args) {
        VariaveisClasse obj = new VariaveisClasse();
        obj.mostrarContador();
    }
}

==================================================
== CÓDIGO 3: Constantes com final
==================================================

public class Constantes {
    public static void main(String[] args) {
        final double PI = 3.14159;
        double raio = 2.0;
        double area = PI * raio * raio;

        System.out.println("Área do círculo: " + area);
    }
}

==================================================
== CÓDIGO 4: Tipos por Referência
==================================================

public class Pessoa {
    String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Ana");
        Pessoa p2 = p1;

        System.out.println("Nome antes: " + p2.nome);
        p2.nome = "Carla";
        System.out.println("Nome depois: " + p1.nome);
    }
}
*/
