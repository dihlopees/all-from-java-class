package TDE0404;
import java.util.Scanner;
public class Exercicio {
    public static void main (String[] args) {
        Aluno aluno = new Aluno();
        Curso curso = new Curso();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome do aluno");
        aluno.nome = scanner.next();
        System.out.println("Informe o ra do aluno");
        aluno.ra = scanner.next();

        curso.getCursos();
        System.out.println("Informe o cod do curso");
        aluno.curso = curso.cursoEscolhido(scanner.nextInt());

        System.out.println("Nome....: "+aluno.nome+"");
        System.out.println("Ra......: "+aluno.ra+" ");
        System.out.println("Curso....: "+aluno.curso+"");
    }
}
