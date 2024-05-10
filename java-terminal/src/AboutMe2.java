import java.util.Locale;
import java.util.Scanner;

public class AboutMe2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite o Nome");
        String nome = scanner.next();

        System.out.println("Digite o Sobrenome");
        String sobrenome = scanner.next();        

        System.out.println("Digite a altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Digite a sua idade:");
        int idade = scanner.nextInt();

        System.out.println("Meu nome é " + nome + " " + sobrenome + ".");
        System.out.println("Tenho "+ idade + " de idade.");
        System.out.println("Tenho a altura de " + altura);
    }
}