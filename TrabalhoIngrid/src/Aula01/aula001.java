package Aula01;

import java.util.Scanner;

public class aula001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valor;
        System.out.println("digite o valor da tabuada ");
        valor = scanner.nextInt();
       for(int i = 0; i <=10; i++) {
           System.out.println(i + " x " + valor + " = " + i*valor);
       }
    }
}
