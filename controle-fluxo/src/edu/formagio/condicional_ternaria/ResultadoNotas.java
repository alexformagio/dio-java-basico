package edu.formagio.condicional_ternaria;

public class ResultadoNotas {
    public static void main(String[] args) {
        avaliaNota(4);
        avaliaNota(6);
        avaliaNota(8);
    }

    public static void avaliaNota(int nota){
        System.out.println("Nota informada: " + nota);
        String resultado= (nota >= 7) ? "Aluno aprovado" :
                          (nota >= 5) ? "Aluno em Recuperação" :
                                        "Aluno Reprovado";
        System.out.println(resultado);
        System.out.println("-----------------------");

}

}