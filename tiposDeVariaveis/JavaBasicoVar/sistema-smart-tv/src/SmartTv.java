public class SmartTv {

    boolean ligada = false;
    int volume = 10;
    int canal = 1;

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        this.volume++;
        System.out.println("Aumentando o volume para: "+volume);
    }
    public void diminuirVolume(){
        this.volume--;
        System.out.println("DIminuindo o volume para: "+volume);
    }

    public void subirCanal(){
        System.out.println("Mudando do canal: "+canal+" ");
        this.canal++;
        System.out.print(" para o canal"+canal+"\n");
    }

    public void diminuirCanal(){
        System.out.println("Mudando do canal: "+canal+" ");
        this.canal++;
        System.out.print(" para o canal"+canal+"\n");
    }

    public void mudarCanal(int novoCanal){
        System.out.println("Mudando do canal: "+canal+" ");
        this.canal = novoCanal;
        System.out.print(" para o canal"+canal+"\n");
    }

}
