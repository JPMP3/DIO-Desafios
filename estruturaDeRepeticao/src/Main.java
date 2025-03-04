public class Main {
    public static void main(String[] args) {
        /*for(int carneirinhos = 1; carneirinhos <= 20; carneirinhos++){
            System.out.println("Contando carneirinhos: "+carneirinhos);
        }
        System.out.println("joãozin dormiu"); */

        //for com array
        String[] alunos = {"Felipe","jonas","Julia","marcos"};

        //for normal
        /*
        for (int x=0; x<alunos.length; x++){
            System.out.println("O aluno no indice "+x+" é: "+alunos[x]);
        }*/

        for(String aluno : alunos){
            System.out.println("nome do aluno: "+aluno);
        }
    }
}