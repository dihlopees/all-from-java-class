import modelo.Aluno;
import modelo.Materia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Materia> listMateria = new ArrayList<>();

        listMateria.add(new Materia("pog", "java", 0));
        listMateria.add(new Materia("poo", "php", 1));
        listMateria.add(new Materia("banco", "sql", 2));

        Aluno aluno = new Aluno();

        System.out.println("digite seu nome: ");
        aluno.setNmAluno(scanner.next());

        System.out.println("digite seu ra");
        aluno.setNrRa(scanner.next());

        System.out.println("digite o cod da materia");

//         listMateria.forEach(System.out::println);

        listMateria.forEach(materia -> {
            System.out.printf("\n cod = %d  materia = %s linguagem = %s",
                    materia.getId(), materia.getNmMateria(), materia.getLinguagem());
        });

//        for (int i =0; i< listMateria.size(); i++) {
//            System.out.printf("\n cod = %d  materia = %s linguagem = %s",
//                    i, listMateria.get(i).getNmMateria(), listMateria.get(i).getLinguagem());
//        }

        aluno.setMateria(listMateria.get(scanner.nextInt()));

        System.out.println("nome... "+aluno.getNmAluno()+"");
        System.out.println("ra... "+aluno.getNrRa()+"");
        System.out.println("materia... "+aluno.getMateria().getNmMateria()+"");
        System.out.println("linguagem... "+aluno.getMateria().getLinguagem()+"");
    }
}