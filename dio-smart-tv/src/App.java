public class App {
    public static void main(String[] args) throws Exception {
        SmartTv tv = new SmartTv();
        tv.showConfig();
        tv.ligar();
        tv.aumentarVolume();
        tv.mudarCanal(12);
        tv.showConfig();
    }
}
