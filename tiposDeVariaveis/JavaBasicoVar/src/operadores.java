public class operadores {
    public static void main(String[] args) {
       //string
        /*String nomeCompleto = "Linguagem" + "Java";
        System.out.println(nomeCompleto);*/

        //strings e numeros
        /*String contatenação = "?";

        System.out.println(contatenação);

        contatenação = 1+1+1+"1";
        System.out.println(contatenação);

        contatenação = 1+"1"+1+1;
        System.out.println(contatenação);

        contatenação = 1+"1"+1+"1";
        System.out.println(contatenação);

        contatenação = "1"+1+1+1;
        System.out.println(contatenação);

        contatenação = "1"+(1+1+1);
        System.out.println(contatenação);*/

        //negativo e positivo
        /*
        int n = 5;
        System.out.println(n);

        n = - n;

        System.out.println(n);

        n =  n * -1;

        System.out.println(n);
        */

        //atribuição
        /*
        int n = 5;

        System.out.println(n++); //não atualiza assim que o print é feito, só depois
        System.out.println(n);
        n = 5;
        System.out.println(n);
        System.out.println(++n); //atualiza e printa na hora se o ++ for antes
        */

        //operador ternário
        /*
        int a = 5,b = 6;
        String result = a==b ? "verdadeiro" : "falso";

       /*
        if(a==b){
            result = "verdadeiro";
        }else{
            result = "falso";
        }
        System.out.println(result);*/

        //operador relacional
        /*
        String s1 = "jotaper", s2 = new String("jotaper");
        System.out.println(s1.equals(s2));


        int n1 = 1, n2 = 2;

        boolean verify = n1 == n2;
        System.out.println("n1 == n2 ? "+verify);

        verify = n1 != n2;
        System.out.println("n1 != n2 ? "+verify);

        verify = n1 > n2;
        System.out.println("n1 > n2 ? "+verify);

        verify = n1 < n2;
        System.out.println("n1 < n2 ? "+verify);
        */

        //logicos
        boolean b1 = true, b2 = false;

        if (b1 && (7 > 4)){
            System.out.println("as duas são verdadeiro");
        }

        if (b1 || b2){
            System.out.println("uma das condições é verdadeiro");
        }

        System.out.println("fim");

    }
}
