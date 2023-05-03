package exercicio2;

import java.util.ArrayList;
import java.util.List;

public class Carro {
    private List<String> listCarro = new ArrayList<>();

    public void adicionarCarro(String nome) {
        if (!nome.isEmpty()) listCarro.add(nome);
        else System.out.println("Nome obrigatorio nao pode ser vazio");
    }

    public void removerCarro(int indice) {
        listCarro.remove(indice);
    }

    public void printarListaCarros(){
        for (String carro : listCarro) {
            System.out.println( "Item = " + listCarro.indexOf(carro) + " Nome = " + carro);
        }
    }
}
