package TDE0304;
import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        int[] numeros = new int[10];
        int[] numerosDois = new int [10];
        int[] intersecao = new int [10];

        Scanner scanner = new Scanner(System.in);
        for (int i=0; i < 10; i++) {
            System.out.println("Informe um numero inteiro");
            numeros[i] = scanner.nextInt();

            System.out.println("Informe um numero inteiro para o segundo array");
            numerosDois[i] = scanner.nextInt();
        }

        for (int i=0; i < 10; i++) {
            for (int j =0; j <10; j++ ) {
                if (numeros[i] == numerosDois[j]) {
                    intersecao[i] = numeros[i];
                    System.out.println(intersecao[i]);
                }
            }

        }

    }




}
