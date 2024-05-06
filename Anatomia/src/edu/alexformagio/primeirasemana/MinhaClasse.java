package edu.alexformagio.primeirasemana;

public class MinhaClasse {
public static void main(String[] args) {
    System.out.println("Inicio de Anatomia");
    nomeValidosDeVariaveis();
    tiposVariaveis();
    System.out.println(nomeCompleto("Alexandre", "Formagio"));
}

public static void nomeValidosDeVariaveis(){
    String numero = "numero";
    String _numero = "_numero";
    String $numero = "$numero";

    System.out.println("Declaração valida de variaveis");
    System.out.println(numero + ", " + _numero + ", " + $numero);
}

public static void tiposVariaveis(){
    String nome ="Alexandre";
    int inteiro = 10;
    double num_decimal=12.98;
    boolean status = true;

    System.out.println("Tipos de variaveis");
    System.out.println("Nome:" + nome);
    System.out.println("Inteiro: " + inteiro);
    System.out.println("Numero Decimal: " + num_decimal);
    System.out.println("status: " + status);
}

public static String nomeCompleto(String firstName, String lastName){
    return firstName + " " + lastName;
}

}
