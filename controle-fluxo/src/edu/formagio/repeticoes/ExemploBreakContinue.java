package edu.formagio.repeticoes;

public class ExemploBreakContinue {
    public static void main(String[] args) {
        for(int i=0; i<30;i++){
        if (i % 2 != 0)
          continue;
        
        if (i > 20)
           break;  

        System.out.println("Numero -> " + i);   

        }
    }
}
