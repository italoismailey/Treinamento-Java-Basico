public class SmartTv {

    boolean ligada=false;
    int canal=1;
    int volume=25;

    
    public void passarCanal (){
        canal++;
    }

    public void voltarCanal (){
        canal--;
    }

    public void mudarCanal (int novoCanal){
        canal = novoCanal;
    }

    public void aumentarVolume (){
        //volume = volume +1
        volume++;
    }

    public void diminuirVolume (){
        //volume = volume -1
        volume--;
    }

    public void muteVolume (){
        //zerar volume
        volume = 0;
    }

    public void ligar (){
        ligada=true;
    }

    public void desligar(){
        ligada=false;
    }
    
}
