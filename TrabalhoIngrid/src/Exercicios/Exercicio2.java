package Exercicios;

import java.util.Scanner;

//1) Crie um programa que tenha interação com o usuário, onde esse faça a seguintes
//        perguntas, qual é seu nome, cargo e salário. Só podem ser aceitos no cadastro os
//        seguintes cargos, Analista, Desenvolvedor e Gerente, e atribua um aumento salarial
//        de 10% para o Analista, 15% para os Desenvolvedores e 5% para os Gerentes, ao
//        término de cada cadastro imprima no console informando no novo valor do salário e o
//        percentual de aumento que teve.
public class Exercicio2 {

    public static void main(String[] args) {
        String nome, cargo;
        int salario;

        Funcionario funcionario = new Funcionario();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o nome do funcionario? ");
        funcionario.setNome(scanner.next());
        System.out.println("Qual o cargo do funcionario?");
        funcionario.setCargo(scanner.next());
        System.out.println("Qual o salario do funcionario?");
        funcionario.setSalario(scanner.nextInt());



        funcionario.calcularAumento(funcionario.getCargo(), funcionario.getSalario());
        imprimirFuncionario(funcionario);

    }

    static void imprimirFuncionario(Funcionario funcionario) {
        System.out.println(" O nome do funcionario é: "+funcionario.getNome()+" cargo: "+funcionario.getCargo()+" " +
                "salario de: "+ funcionario.getSalario()+" e com aumento vai para: "+funcionario.getAumento()+"  ");
    }
}
