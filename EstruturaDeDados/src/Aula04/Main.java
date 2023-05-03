package Aula04;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Cor cor = new Cor();
        Moto moto = new Moto();
        Moto[] listaMoto = new Moto[10];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o modelo: ");
        moto.modelo = scanner.next();

        cor.listaCores();

        System.out.println("Digite o codigo da cor: ");
        moto.cor = cor.getCor(scanner.nextInt());
//        System.out.println(cor.getCor(scanner.nextInt()));

        System.out.println("Modelo....: "+moto.modelo+"");
        System.out.println("Cor.......: "+moto.cor+" ");

        listaMoto[0] = moto;
    }


}
