public class Main {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Joao", 20, "123456", "joao@email.com");

        pessoa.andar();
        pessoa.comer();

        pessoa.setNome("Carlos");
        System.out.println("Nome: " + pessoa.getNome());

        pessoa.setIdade(25);
        System.out.println("Idade: " + pessoa.getIdade());


        Carro carro = new Carro("Fiat", "Uno", "Preto", 2020);

        carro.acelerar();
        carro.frear();

        carro.setModelo("Argo");
        System.out.println("Modelo: " + carro.getModelo());


        Animal animal = new Animal("Bob", "Cachorro", 3);
        animal.emitirSom();


        Escola escola = new Escola("Escola Brasil", "Rua Central", 500);
        escola.abrir();
        escola.ensinar();


        Computador computador = new Computador("Dell", "Intel", 8);
        computador.ligar();


        Celular celular = new Celular("Samsung", "A15", 100);
        celular.fazerLigacao();


        Aluno aluno = new Aluno("Pedro", 123, "ADS");

        aluno.estudar();

        aluno.setCurso("Desenvolvimento de Sistemas");
        System.out.println("Curso: " + aluno.getCurso());


        Professor professor = new Professor("Maria", "Programacao", 35);
        professor.ensinar();


        Estadio estadio = new Estadio("Mineirao", "Belo Horizonte", 60000);
        estadio.abrir();
        estadio.realizarJogo();


        Produto produto = new Produto("Notebook", 2500, 10);
        produto.comprar(2);
        produto.vender(1);
    }
}