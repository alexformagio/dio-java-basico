public class AboutMe {
    public static void main(String[] args) throws Exception {
        String nome = args[0];
        String sobrenome = args[1];
        String idade = args[2];
        String altura = args[3];

        System.out.println("Meu nome é " + nome + " " + sobrenome);
        System.out.println("Tenho "+ idade + " de idade.");
        System.out.println("Tenho a altura de " + altura);
    }
}
