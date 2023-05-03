package Exercicios;
import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args) {

//        1) Crie um algoritmo que imprima uma tabuada no console, onde esse programa seja
////    dinâmico, Exp. Deve ser apresentado no console perguntando qual tabuada que
////    programa deve gerar, se o usuário digitar 10, deve ser impressa a tabuada do 10 e
////    assim para demais interação.

        Scanner input = new Scanner(System.in);
        int n10, i;
        System.out.print("Digite o valor para calcular tabuada: ");
        n10 = input.nextInt();
        i = 0;
        while(i <= 10) {
            System.out.println(n10 + " x " + i + " = " +  n10 * i );
            i++;
        }

//        2) A empresa TecCod LTDA precisa de um programa para calcular o novo salário dos
//        funcionários irão receber a partir do mês que vem. Sabendo que o aumento de salário
//        para todos os funcionários será de 25%, faça um programa que lê o valor do salário
//        atual do funcionário e informa o seu novo salário acrescido de 25%.
        int salario;
        double aumento = 1.25;

        System.out.print("Digite o valor do salario do funcionario: ");
        salario = input.nextInt();


        System.out.println(" O salario do funcionario sera de R$ " + salario * aumento);
//        3) Faça um algoritmo para ler o nome do aluno e o valor de quatros (4) notas, se a
//        média for maior ou igual a 70 imprima no console que ele está aprovado, se a nota for
//        maior ou igual 65 imprima no console que ele está de exame e se a média for abaixo
//        de 65 imprima no console que ele está reprovado.

        String nome;
        int n1, n2, n3, n4;
        double media, soma;

        System.out.print("Digite o nome do aluno: ");
        nome = input.next();

        System.out.print("Digite o nota 1 do aluno: ");
        n1 = input.nextInt();
        System.out.print("Digite o nota 2 do aluno: ");
        n2 = input.nextInt();
        System.out.print("Digite o nota 3 do aluno: ");
        n3 = input.nextInt();
        System.out.print("Digite o nota 4 do aluno: ");
        n4 = input.nextInt();

        soma = n1 +n2 + n3 + n4;
        media = soma / 4;

        if (media >= 70) {
            System.out.println(" Aprovado, media >= 70");
        } else if (media >= 65 && media < 70) {
            System.out.println(" Exame, media entre 65 e 70");
        } else {
            System.out.println(" Reprovado, media menor que 65");
        }

        System.out.println(" media: " + media);
        System.out.println(" soma: " + soma);
    }
}


