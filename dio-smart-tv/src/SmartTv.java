public class SmartTv{
    private boolean ligada = false;
    private int volume = 1;
    private int canal=2;

        
    public void ligar() {
        this.ligada = true;
    }

    public void desligar() {
        this.ligada = false;
    }    

    public void aumentarVolume() {
        this.volume = this.volume + 1;
    }

    public void diminuirVolume() {
        this.volume = this.volume - 1;
    }

    public void mudarCanal(int canal) {
        this.canal = canal;
    }

    public void avancarCanal() {
        this.canal ++;
    }

    public void voltarCanal() {
        this.canal --;
    }    

    public boolean isLigada() {
        return ligada;
    }
    public int getVolume() {
        return volume;
    }
    public int getCanal() {
        return canal;
    }

    public void showConfig(){
        System.out.println("***********************");
        System.out.println("TV Ligada: " + (this.ligada ? "Sim" : "Não"));
        System.out.println("Volume: " + this.volume);
        System.out.println("Canal: " + this.canal);
        System.out.println("***********************");        
    }

    
}