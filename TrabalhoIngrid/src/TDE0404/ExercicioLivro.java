package TDE0404;

import java.util.Scanner;

public class ExercicioLivro {
    public static void main(String[] args) {
        Livro livro = new Livro();
        Scanner scanner = new Scanner(System.in);
//        Livro[] listaDeLivros = new Livro[2];

//        System.out.println("informe o tiulo do livro");
//        livro.titulo = scanner.next();
//        System.out.println("informe a editora do livro");
//        livro.editora = scanner.next();


        livro.add(new Livro("teste4", "testando4"));
        livro.add(new Livro("teste2", "testando2"));
        livro.add(new Livro("teste3", "testando3"));



//        livro.add(livro);
        livro.list();
//        livro.add(livro2);
//        listaDeLivros[0] = livro;

//        for(Livro i: listaDeLivros) {
//            System.out.println(i.titulo);
//        }
    }
}
