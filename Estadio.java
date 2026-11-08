public class Estadio {
    String nome;
    String cidade;
    int capacidade;

    public Estadio(String nome, String cidade, int capacidade) {
        this.nome = nome;
        this.cidade = cidade;
        this.capacidade = capacidade;
    }

    public void abrir() {
        System.out.println("O estadio está lotado.");
    }

    public void realizarJogo() {
        System.out.println("Está acontecendo um jogo no estadio.");
    }
}