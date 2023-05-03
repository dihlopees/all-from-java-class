package Aula04;

import java.util.ArrayList;
import java.util.List;

public class Lista {

    public static void main (String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Azul");
        list.add("Verde");

        list.stream().forEach(System.out::println);
        list.remove(1);
        list.stream().forEach(System.out::println);
    }
}
