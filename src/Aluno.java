import java.util.Scanner;

class Aluno {
    Scanner scanner = new Scanner(System.in);

    private String nome;
    private int av1;
    private int av2;
    private int media;
    private int avFinal;
    public Aluno(String nome, int av1, int av2) {
        this.nome = nome;
        this.av1 = av1;
        this.av2 = av2;
        this.media = (av1 + av2) / 2;
    }
    protected void verificar3prova(){
        if (!passouSemTerceiraProva()){
            System.out.println("Digite a nota da Av3");
             this.avFinal = Integer.parseInt(scanner.nextLine());
        }

    }
    public String getNome() {
        return nome;
    }
    public int getMedia() {
        return media;
    }
    protected boolean passouSemTerceiraProva() {
        return (av1 + av2) / 2 >= 6;
    }
    protected boolean aprovadoComTerceiraProva() {
        return ((avFinal + media) / 2 >= 6);
    }

}
