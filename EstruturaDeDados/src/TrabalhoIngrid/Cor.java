package TrabalhoIngrid;

public class Cor {
    public String[] listaCor = new String[5];
    public Cor(){
        listaCor[0] = "Azul";
        listaCor[1] = "Amarelo";
        listaCor[2] = "Vermelho";
        listaCor[3] = "Verde";
        listaCor[4] = "Rosa";
    }

    public void buscarCoresDisponiveis(){
        for(int i=0; i<5; i++) {

           if (listaCor != null) System.out.println("Código da cor = "+i+" cor = "+listaCor[i]+"");
        }
    }

    public String buscarCorEscolhida(int indice){
        return listaCor[indice];
    }
}
