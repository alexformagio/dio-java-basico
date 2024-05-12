package edu.formagio.excecoes;

public class FormatadorCep {
    public static void main(String[] args) {
     try {
        formatarCep("13960000");   
     } catch (Exception e) {
        // TODO: handle exception
     }   
     

     try {
        formatarCep("13960");
    } catch (CepInvalidoException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    }

    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
          throw new CepInvalidoException();
        
          //simulando um cep formatado
          return "23.765-064";
    }
}
