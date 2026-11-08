public class Professor {
    String nome;
    String disciplina;
    int idade;

    public Professor(String nome, String disciplina, int idade) {
        this.nome = nome;
        this.disciplina = disciplina;
        this.idade = idade;
    }

    public void ensinar() {
        System.out.println(nome + " está ensinando " + disciplina);
    }

    public void corrigirProva() {
        System.out.println(nome + " está corrigindo provas.");
    }
}