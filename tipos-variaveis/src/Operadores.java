public class Operadores {
    public static void main(String[] args) {
        // classe Operadores.java
        String nomeCompleto = "LINGUAGEM" + "JAVA";
        System.out.println(nomeCompleto);

        // qual o resultado das expressoes abaixo?
        String concatenacao = "?";

        concatenacao = 1 + 1 + 1 + "1";
        System.out.println("concatenacao = 1 + 1 + 1 + \"1\" => " + concatenacao);

        concatenacao = 1 + "1" + 1 + 1;
        System.out.println("concatenacao = 1 + \"1\" + 1 + 1 => " + concatenacao);

        concatenacao = 1 + "1" + 1 + "1";
        System.out.println("concatenacao = 1 + \"1\" + 1 + \"1\" => " + concatenacao);

        concatenacao = "1" + 1 + 1 + 1;
        System.out.println("concatenacao = \"1\" + 1 + 1 + 1 => " + concatenacao);

        concatenacao = "1" + (1 + 1 + 1);
        System.out.println("concatenacao = \"1\" + (1 + 1 + 1) => " + concatenacao);

        //Operadores unários
        int numero = 5;
        numero = numero * -1;
        System.out.println(numero);

        numero = numero * -1;
        System.out.println(numero);
        System.out.println(++numero);
        System.out.println(numero++);
        numero++;
        System.out.println(numero);
        System.out.println(numero--);
        System.out.println(numero);

        boolean variavel = false;
        if (!variavel) {
            System.out.println("Valor invertido para verdadeiro");
        }

        //Operadores ternários
        System.out.println(variavel ? "Variavel é verdadeira" : "Variavel é falsa");
    }
}
