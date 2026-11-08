public class Computador {
    String marca;
    String processador;
    int memoria;

    public Computador(String marca, String processador, int memoria) {
        this.marca = marca;
        this.processador = processador;
        this.memoria = memoria;
    }

    public void ligar() {
        System.out.println("O computador está ligado.");
    }

    public void desligar() {
        System.out.println("O computador está desligado.");
    }
}