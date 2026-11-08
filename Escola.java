public class Escola {
    String nome;
    String endereco;
    int quantidadeAlunos;

    public Escola(String nome, String endereco, int quantidadeAlunos) {
        this.nome = nome;
        this.endereco = endereco;
        this.quantidadeAlunos = quantidadeAlunos;
    }

    public void abrir() {
        System.out.println("A escola está aberta.");
    }

    public void ensinar() {
        System.out.println("A escola está ensinando.");
    }
}