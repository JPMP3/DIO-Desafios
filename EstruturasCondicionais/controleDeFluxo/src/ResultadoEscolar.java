public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 6;
        //operador ternario
        String resultado = nota>=7 ? "Aprovado" : nota >= 5 && nota <7 ? "exame" : "reprovado";

        System.out.println(resultado);



        //if, else if e else
        /*
        if (nota >= 7)
            System.out.println("aprovado");
        else if (nota>=5 && nota < 7)
            System.out.println("recuperação");
        else
            System.out.println("reprovada");
        */
    }
}
