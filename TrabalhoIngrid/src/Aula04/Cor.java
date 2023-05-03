package Aula04;

public class Cor {

    public String[] listaCor = new String[10];

    public Cor(){
        listaCor[0] = "Azul";
        listaCor[1] = "Amarelo";
        listaCor[2] = "Vermelho";
        listaCor[3] = "Verde";
        listaCor[4] = "Rosa";
    }

    public void listaCores(){
        for (int i =0; i< listaCor.length; i++) {
            if(listaCor[i] != null) System.out.println("Cod = "+i+" cor = "+listaCor[i]+"");
        }
    }

    public String getCor(int cod) {
       return listaCor[cod];
    }
}
