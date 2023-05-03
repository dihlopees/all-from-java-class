package Exercicios;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome:");
        pessoa.nome = scanner.next();
        System.out.println("Idade:");
        pessoa.idade = scanner.nextInt();
        System.out.println("Genero:");
        pessoa.genero = scanner.next();
        System.out.println("CPF:");
        pessoa.CPF = scanner.next();
        System.out.println("RG:");
        pessoa.RG = scanner.next();

        imprimir(pessoa);
    }

    static void imprimir(Pessoa pessoa) {
        System.out.println("Nome: "+pessoa.nome+" Idade: "+pessoa.idade+" Genero: "+pessoa.genero+" " +
                " CPF: "+pessoa.CPF+"   RG "+pessoa.RG+"    ");

    }
}
