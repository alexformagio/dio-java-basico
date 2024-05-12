package edu.formagio.repeticoes;

public class ExemploWhile {
    public static void main(String[] args) {
        int contador = 0;
        int soma = 0;
        while (contador <= 100) {
            soma += contador;
            contador++;
        }

        System.out.println("A soma de 1 a 100 => " + soma);
    }
}
