public class Celular {
    String marca;
    String modelo;
    int bateria;

    public Celular(String marca, String modelo, int bateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
    }

    public void ligar() {
        System.out.println("O celular está ligado.");
    }

    public void fazerLigacao() {
        System.out.println("Realizando uma ligação.");
    }
}