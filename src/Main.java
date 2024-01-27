import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Aluno> aprovados = new ArrayList<>();
        List<Aluno> reprovados = new ArrayList<>();
        List<Aluno> aprovados3Prova = new ArrayList<>();

        for (int i = 0; i < 25; i++) {
            System.out.println("Digite o nome do Aluno:");
            String name = scanner.nextLine();
            System.out.println("Digite a nota da av1 do aluno:");
            int av1 = Integer.parseInt(scanner.nextLine());
            System.out.println("Digite a nota da av2 do aluno:");
            int av2 = Integer.parseInt(scanner.nextLine());
            Aluno aluno = new Aluno(name, av1, av2);
            aluno.verificar3prova();

            if (aluno.passouSemTerceiraProva()) {
                aprovados.add(aluno);
            } else if (aluno.aprovadoComTerceiraProva()) {
                aprovados3Prova.add(aluno);
            } else {
                reprovados.add(aluno);
            }
        }

        System.out.println("Alunos Aprovados:");
        for (Aluno aluno : aprovados) {
            System.out.println("Nome: " +  aluno.getNome()+ "\n" + "Media:" + aluno.getMedia());
        }

        System.out.println("\nAlunos Reprovados:");
        for (Aluno aluno : reprovados) {
            System.out.println("Nome: " +  aluno.getNome()+ "\n" + "Media:" + aluno.getMedia());
        }

        System.out.println("\nAlunos Aprovados apos a terceira prova:");
        for (Aluno aluno : aprovados3Prova) {
            System.out.println("Nome: " +  aluno.getNome()+ "\n" + "Media:" + aluno.getMedia());
        }
    }
}




