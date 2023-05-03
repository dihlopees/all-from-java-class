package Exercicios;

import java.util.Scanner;

//3) Faça uma estrutura de repetição onde e perguntado qual o nome de pessoa, onde
//        esse pare quando e digitado um algum número específico. Exemplo 0
public class While0 {
    public static void main(String[] args) {
        String nome;
        int numero = 1;
        Scanner scanner = new Scanner(System.in);

        while (numero != 0) {
            System.out.println("qual seu nome?");
            nome = scanner.next();
            System.out.println("informe um numero");
            numero = scanner.nextInt();
        }
    }
}
