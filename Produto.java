public class Produto {
    String nome;
    double preco;
    int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void comprar(int quantidade) {
        this.quantidade = this.quantidade + quantidade;
        System.out.println("Produto comprado.");
    }

    public void vender(int quantidade) {
        if (quantidade <= this.quantidade) {
            this.quantidade = this.quantidade - quantidade;
            System.out.println("Produto vendido.");
        } else {
            System.out.println("Estoque insuficiente.");
        }
    }
}