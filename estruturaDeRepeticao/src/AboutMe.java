import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Locale;

public class AboutMe {
    public static void main(String[] args) {

        //erros possiveis
        /*Não informar nome e sobrenome
        * O valor da idade ter um caractere NÃO numerico
        * O valor da altura ter uma virgula ao inves de ser um ponto (conforme o padrão americano)*/


        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        //sem tratamento de exceção
        /*
        System.out.println("Digite seu nome: \n");
        String nome = input.next();

        System.out.println("Digite seu sobrenome: \n");
        String sobrenome = input.next();

        System.out.println("Digite sua idade: \n");
        int idade = input.nextInt();

        System.out.println("Digite sua altura: \n");
        double altura = input.nextDouble();

        System.out.println("Olá, me chamo "+nome.toUpperCase()+" "+sobrenome+".\nTenho "+idade+" anos.\nMinha altura é "+altura+" cm.");*/

        //com tratamento

        try{
            System.out.println("Digite seu nome: \n");
            String nome = input.next();

            System.out.println("Digite seu sobrenome: \n");
            String sobrenome = input.next();

            System.out.println("Digite sua idade: \n");
            int idade = input.nextInt();

            System.out.println("Digite sua altura: \n");
            double altura = input.nextDouble();

            System.out.println("Olá, me chamo "+nome.toUpperCase()+" "+sobrenome+".\nTenho "+idade+" anos.\nMinha altura é "+altura+" cm.");
        }catch (InputMismatchException e){
            System.out.println("Campos idade e altura precisam ser numericos\nOBS: use . no lugar da , ao escrever numeros com virgula");
        }
        input.close();
    }
}
