import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        //Entrada - Saída - Processamento

        Scanner leitor = new Scanner(System.in);
        Scanner leitorNumerico = new Scanner(System.in);

        //Sáida
        System.out.println("Olá Mundo!");


        //Variável de memória -> é um espaço na memória RAM para armazenar uma informação
        //TIPO DADO
        int idade; //variável que vai armazenar um número inteiro e chama idade
        String nome;
        double altura; //numeros reais
        char letra; //armazena 1 caracter

        System.out.println("Digite seu nome:");
        nome = leitor.nextLine();
        System.out.println("Boa noite, " + nome + "! Bem vindo ao Shift Java");

        System.out.println("Digite sua idade:");
        idade = leitorNumerico.nextInt();

        System.out.println(nome + " você tem " + idade + " anos");

        System.out.println("Digite o nome da sua mãe");
        String nomeMae = leitor.next();

        System.out.println("o nome dela é " + nomeMae);


    }
}
