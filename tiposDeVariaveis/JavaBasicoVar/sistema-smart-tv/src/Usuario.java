//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        smartTv.subirCanal();
        smartTv.diminuirCanal();
        smartTv.mudarCanal(23);

        System.out.println("TV Ligada ? "+smartTv.ligada);
        System.out.println("TV volume atual ? "+smartTv.volume);
        System.out.println("TV canal atual ? "+smartTv.canal);

        smartTv.ligar();
        System.out.println("muda -> TV Ligada ? "+smartTv.ligada);
        smartTv.desligar();
        System.out.println("muda -> TV Ligada ? "+smartTv.ligada);
    }
}