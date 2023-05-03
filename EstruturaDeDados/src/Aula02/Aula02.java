package Aula02;

import java.util.Scanner;

public class Aula02 {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.cor = "vermelho";
        carro.nrPortas = 4;
        carro.potencia = 2.0;

        imprimi(carro);

        Carro carro2 = new Carro();

        carro2.cor = "preto";
        carro2.nrPortas = 2;
        carro2.potencia = 1.0;

        imprimi(carro2);

        Calculadora calculadora = new Calculadora();

        calculadora.soma(2,2);
        calculadora.soma(3,2);
        calculadora.soma(2,5);

        Scanner scanner = new Scanner(System.in);

        int valor, valor2 ;

        System.out.println("Digite o primeiro valor a ser somado: ");
        valor = scanner.nextInt();
        System.out.println("Digite o segundo valor a ser somado");
        valor2 = scanner.nextInt();

        calculadora.soma(valor, valor2);
        calculadora.multiplicacao(valor, valor2);


    }

    static void imprimi(Carro carro) {
        System.out.println("cor = "+carro.cor+" com "+carro.nrPortas+" portas e potencia de "+carro.potencia+"");
    }

}
