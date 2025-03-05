import java.util.Scanner;

public class CalculadoraDeMedias {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] alunos = {"Camila", "Lucas", "Bruna", "Pedro"};

        double media = calculaMediaDaTurma(alunos,input);

        System.out.printf("Média da turma %.2f",media);
    }

    static double calculaMediaDaTurma(String[] alunos, Scanner input){
        double soma = 0;
        for (String aluno : alunos){
            System.out.printf("Nota do aluno %s: ", aluno);
            double nota = input.nextDouble();
            soma+=nota;
        }

        return soma / alunos.length;
    }
}
