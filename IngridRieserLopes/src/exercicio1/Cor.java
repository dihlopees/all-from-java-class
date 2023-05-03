package exercicio1;

import java.util.Scanner;

public class Cor {
    private String[] arrayCor = new String[4];
    Scanner scanner = new Scanner(System.in);
    public void adicionarCor(){
        for(int i =0 ; i < arrayCor.length; i++) {
            System.out.println("Cadastre sua cor:");
            String varAux = scanner.next();
            if (!varAux.isEmpty()) arrayCor[i] = varAux;
            else System.out.println("Cor não pode ser vazio");
        }
        System.out.println("4 cores cadastradas com sucesso!");
    }

    public void listarCores() {
        System.out.println("Essas são suas cores cadastradas:");

        for (int i = 0; i < arrayCor.length; i++) {
            System.out.println(arrayCor[i]);
        }
    }
}
