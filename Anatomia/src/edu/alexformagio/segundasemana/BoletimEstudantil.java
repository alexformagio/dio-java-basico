package edu.alexformagio.segundasemana;

public class BoletimEstudantil {

    public static void main(String[] args) {
        int media = 6;
        if (media < 6) {
            System.out.println("Aluno Reprovado");
        } else if (media == 6) {
            System.out.println("Aluno em Recuperação");
        } else {
            System.out.println("Aluno Aprovado");
        }
    }
}
