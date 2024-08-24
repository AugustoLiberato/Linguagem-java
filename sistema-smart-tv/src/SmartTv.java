public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
    public void aumenarCanal(){
            canal++;
    }
    public void diminuirCanal(){
        canal--;
    }


    public void aumentarVolume(){
        volume++;//operador unário == volume = volume + 1;
        System.out.println("Aumentando o volume para: " + volume);
      
    }
    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }

    public void ligar(){
        this.ligada=true;
    }
    public void desligar(){
        this.ligada = false;
    }
}