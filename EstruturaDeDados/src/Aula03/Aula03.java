package Aula03;

import Exercicios.Pessoa;

//Array
public class Aula03 {
    public static void main(String[] args) {
        int[] lista = new int[10];

        for(int i =0; i < lista.length ; i++) {
            lista[i] = i + 30 * 2;
        }

        printLista(lista);

        Pessoa[] pessoas = new Pessoa[2];

        Pessoa umaPessoa = new Pessoa();

        umaPessoa.nome = "ingrid";

        Pessoa duasPessoa = new Pessoa();

        duasPessoa.nome = "fernando";


    }

    static void printLista(int[] lista) {
        for(int i =0; i < lista.length ; i++) {
            System.out.println(lista[i]);
        }
    }
}
