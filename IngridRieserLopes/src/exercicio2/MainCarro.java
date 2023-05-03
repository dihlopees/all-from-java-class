package exercicio2;

import java.util.Scanner;

public class MainCarro {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Scanner scanner = new Scanner(System.in);

        for(int i =0 ; i < 4; i++) {
            System.out.println("Informe o nome do carro:");
            carro.adicionarCarro(scanner.next());
        }

        carro.printarListaCarros();

        System.out.println("Qual item deseja remover da lista? ");
        carro.removerCarro(scanner.nextInt());

         carro.printarListaCarros();
    }
}
