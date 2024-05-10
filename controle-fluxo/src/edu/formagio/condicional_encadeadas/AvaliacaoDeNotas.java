package edu.formagio.condicional_encadeadas;

public class AvaliacaoDeNotas {
    public static void main(String[] args) {
        avaliaNota(4);
        avaliaNota(6);
        avaliaNota(8);
    }

    public static void avaliaNota(int nota){
        System.out.println("Nota informada: " + nota);
        if (nota >= 7) {
            System.out.println("Aluno aprovado");
        }else if (nota >= 5) {
            System.out.println("Aluno em Recuperação");
        }else{
            System.out.println("Aluno Reprovado");
        }
        System.out.println("-----------------------");
    }
}
