package TrabalhoIngrid;

public class Carro {

    String cor;
    String modelo;
    String tipoDeCombustivel;
    int potencia;

    int indice;

    Carro[] listaDeCarros;

    public Carro() {
        listaDeCarros = new Carro[10];
        indice = 0;
    }
    public Carro( String cor, String modelo, String tipoDeCombustivel, int potencia){
        this.cor = cor;
        this.modelo = modelo;
        this.potencia = potencia;
        this.tipoDeCombustivel = tipoDeCombustivel;
    }

    public void adicionarCarroALista(Carro carro) {
        listaDeCarros[indice] = carro;
        indice++;
    }

    public void listarTodosOsCarros(){
        for(Carro carro: listaDeCarros){
            if (carro != null) System.out.println(carro);
        }
    }

    @Override
    public String toString() {
        return "Carro{" +
                "cor='" + cor + '\'' +
                ", modelo='" + modelo + '\'' +
                ", tipoDeCombustivel='" + tipoDeCombustivel + '\'' +
                ", potencia=" + potencia +
                '}';
    }
}
