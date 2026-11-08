public class Aluno {
    private String nome;
    private int matricula;
    private String curso;

    public Aluno(String nome, int matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public int getMatricula() {
    return matricula;
}
    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void estudar() {
        System.out.println(nome + " está estudando.");
    }

    public void fazerProva() {
        System.out.println(nome + " está fazendo uma prova.");
    }
}