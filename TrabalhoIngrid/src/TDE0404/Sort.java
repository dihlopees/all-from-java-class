package TDE0404;

public class Sort {
    public static void main(String[] args) {
        int[] lista = new int[3];

        lista[0] = 10;
        lista[1] = 50;
        lista[2] = 20;

        int temp = 0;
        for(int i=0; i< lista.length; i++){
            for(int x=0; x< lista.length; x++) {
                if (lista[i] < lista[x]) {
                    temp = lista[i];
                    lista[i] = lista[x];
                    lista[x] = temp;
                }
            }
        }

           for(int i: lista){
               System.out.println(i);
           }
    }
}
