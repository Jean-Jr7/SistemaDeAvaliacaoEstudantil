package edu.universidade.application;

import edu.universidade.models.Aluno;
import edu.universidade.models.ListaDeAlunos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaDeAlunos lista = new ListaDeAlunos();

        for (int i = 1; i <= 25; i++) {
            Aluno aluno = Aluno.criarAlunoComEntrada(scanner);
            aluno.verificar3prova();
            lista.classificarAlunoNalista(aluno);
        }
        lista.imprimirRelatoriosDeAlunos();
        scanner.close();
    }
}
