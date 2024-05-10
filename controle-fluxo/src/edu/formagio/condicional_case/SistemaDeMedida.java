package edu.formagio.condicional_case;

public class SistemaDeMedida {
    public static void main(String[] args) {
        System.out.println("Tamanho P corresponde a " + avaliaMedida("p"));
        System.out.println("Tamanho M corresponde a " + avaliaMedida("M"));
        System.out.println("Tamanho G corresponde a " + avaliaMedida("G"));
        System.out.println("Tamanho J corresponde a " + avaliaMedida("j"));
    }

    public static String avaliaMedida(String medida){
        String resultado = "";
        medida = medida.toUpperCase();
        switch (medida) {
            case "P":
                resultado = "Pequeno";
                break;
        
                case "M":
                resultado = "Médio";
                break;            
                
                case "G":
                resultado = "Grande";
                break;                
            default:
                resultado = "Opção inválida";
                break;
        }
        return resultado;
    }
}
