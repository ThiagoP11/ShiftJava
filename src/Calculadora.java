import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {


        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro valor");
        int valor1 = leitor.nextInt();

        System.out.println("Digite o segundo valor");
        int valor2 = leitor.nextInt();

        double resultado = valor1 + valor2;
        System.out.println("Resultado somando: " + resultado);

        resultado = valor1 * valor2;
        System.out.println("Resultado multiplicando: " + resultado);

        resultado = valor1 - valor2;
        System.out.println("Resultado subtraindo: " + resultado);

        resultado = (double) valor1 / valor2;
        System.out.println("Resultado dividindo: " + resultado);




    }
}
