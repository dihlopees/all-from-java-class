package TDE0404;

public class Livro {
    String titulo;
    String editora;
    Livro[] lista = new Livro[3];
    int i = 0;
    public Livro(){
        lista = new Livro[3];
        i = 0;
    }

    public Livro(String novoTitulo, String novaEditora) {
        this.titulo = novoTitulo;
        this.editora = novaEditora;
    }
    public void add(Livro livro) {
        lista[i] = livro;
        i++;
    }
    public void list() {
        for(Livro livro: lista){
            if (livro != null) System.out.println(livro);
        }
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", editora='" + editora + '\'' +
                '}';
    }
}
