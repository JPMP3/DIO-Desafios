public class CaixaEletronico {
    public static void main(String[] args) {
        double valorSaldo = 30.0;
        double valorSaque = 10.5;

        if(valorSaque <= valorSaldo){
            valorSaldo-=valorSaque;
        }
        System.out.println(valorSaldo);

    }
}
