import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception{
        /*TODO: conhecer e importar a classe Scanner
        *Exibir mensagens ao usuário
        *Obter pelo Scanner os valores inseridos no terminal
        *Exibir a mensagem da “conta criada”
        * */
        Scanner input = new Scanner(System.in);

        //var
        int numeroConta = 0;
        String agenciaConta = "", nomeCliente = "";
        double saldoConta = 0f;

        //read the values
        //Conta
        System.out.println("Por favor, digite o número da conta:  ");
        numeroConta = Integer.parseInt(input.nextLine());

        //Agencia
        System.out.println("Por favor, digite o número a Agência:  ");
        agenciaConta = input.nextLine();

        //nome do cliente
        System.out.println("Por favor, digite o seu Nome:  ");
        nomeCliente = input.nextLine();

        //saldo na conta
        System.out.println("Por favor, digite o saldo da conta:  ");
        saldoConta = input.nextDouble();


        mostrarConta(numeroConta,agenciaConta,nomeCliente,saldoConta);
    }


    //Função criada para output
    public static void mostrarConta(int numeroInformado, String agenciaInformada, String nomeInformado, double saldoInformado){
        System.out.printf("\n\n|| Olá Cliente %s, obrigado por criar uma conta em nosso banco! ;) || " +
                "\nSua agência é: %s\nNúmero da sua Conta: %d\nSaldo disponível para saque: %.2f",
                nomeInformado,agenciaInformada,numeroInformado,saldoInformado);
    }
}