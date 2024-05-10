public class tipos {
    public static void main(String[] args) throws Exception {
        short numeroCurto = 200;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;
        System.out.println("Numero curto com cast -> " + numeroCurto2);

        final String SOU_UMA_CONSTANTE = "Alexandre Formagio";
        // SOU_UMA_CONSTANTE = ""; não permite essa ação
        final double VALOR_DE_PI = 3.14;

        System.out.println(SOU_UMA_CONSTANTE + " definiu um valor para PI: " + VALOR_DE_PI);
    }
}
