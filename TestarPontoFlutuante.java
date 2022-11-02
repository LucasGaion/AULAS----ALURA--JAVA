public class TestarPontoFlutuante {//classe defenida {TestarPontoFlutuante}

    public static void main(String[] args){ //

        double salario; //declarado um salario como uma variavel
        salario = 1800.50; //salario -> recebe um valor -> 1800.50 > levo em ponto flutuante

        System.out.println("Meu Salario é " + salario); //println -> "strings" + variavel {salario}


       //divisao com pontos flutuantes

        int outraDivisao = 5 / 2; //->  METODO 1: 'seria 'só para numeros inteiros'
        System.out.println(outraDivisao);

        double divisao = 3.14 / 2; //-> METODO 2: seria 'para numeros nao inteiros, numeros quebrados '
        System.out.println(divisao);


        double outraTentativa = 5 / 2; // METODO 3: a conta para dar certo teria que ser -> 5.00 / 2 = 2.5
        System.out.println(outraTentativa);

    }

}
