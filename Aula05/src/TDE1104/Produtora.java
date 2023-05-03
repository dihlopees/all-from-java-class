package TDE1104;

import java.util.ArrayList;
import java.util.List;

public class Produtora {
    String nomeProdutora;
    String cnpj;
    int indice = 0;

    public Produtora[] listaProdutora = new Produtora[3];
    public Produtora(String nome, String cnpj) {
        this.nomeProdutora = nome;
        this.cnpj = cnpj;
    }

    public void addLista(Produtora produtora) {
        listaProdutora[indice] = produtora;
        indice++;
    }
}
