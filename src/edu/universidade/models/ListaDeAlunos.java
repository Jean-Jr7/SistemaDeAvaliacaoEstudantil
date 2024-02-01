package edu.universidade.models;

import java.util.ArrayList;
import java.util.List;


public class ListaDeAlunos {
    private List<Aluno> aprovados;
    private List<Aluno> reprovados;
    private List<Aluno> aprovados3Prova;

    public ListaDeAlunos() {
        this.aprovados = new ArrayList<>();
        this.reprovados = new ArrayList<>();
        this.aprovados3Prova = new ArrayList<>();
        ;
    }

    public void classificarAlunoNalista(Aluno aluno) {
        if (aluno.passouSemTerceiraProva()) {
            aprovados.add(aluno);
        } else if (aluno.aprovadoComTerceiraProva()) {
            aprovados3Prova.add(aluno);
        } else {
            reprovados.add(aluno);
        }
    }

    public void imprimirRelatoriosDeAlunos() {

        System.out.println("Alunos Aprovados");
        for (Aluno aluno : aprovados) {
            System.out.println("Nome: " + aluno.getNome() + "\n" + "Media:" + aluno.getMedia());
        }

        System.out.println("\nAlunos Reprovados:");
        for (Aluno aluno : reprovados) {
            System.out.println("Nome: " + aluno.getNome() + "\n" + "Media:" + aluno.getMedia());
        }

        System.out.println("\nAlunos Aprovados apos a terceira prova:");
        for (Aluno aluno : aprovados3Prova) {
            System.out.println("Nome: " + aluno.getNome() + "\n" + "Media:" + aluno.getMedia());
        }
    }


}
