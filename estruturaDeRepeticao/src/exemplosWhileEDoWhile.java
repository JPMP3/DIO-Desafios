//usado no while
import java.util.concurrent.ThreadLocalRandom;
//usado no do while
import java.util.Random;

public class exemplosWhileEDoWhile {
    public static void main(String[] args) {
        //exemplo while
        /*double mesada = 50.0;

        while (mesada>0){
            double valorDoce = valorAleatorio();
            if (valorDoce > mesada)
                valorDoce =mesada;

            System.out.println("Valor doce: "+valorDoce+" adicionado no carrinho");
            mesada=-valorDoce;

        }

        System.out.println("mesada: "+mesada);
        System.out.println("Joãozinho gastou toda a sua mesada em doces.");*/

        //exemplo Do while
        System.out.println("Discando...");

                                                            do{
            System.out.println("Telefone tocando\nObs: tocando.");
        }while (tocando());

        System.out.println("alou");

    }

    private static boolean tocando(){
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu ?" + atendeu);

        return ! atendeu;
    }

    //metodo usado no while
    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2,8);
    }
}
