package strategy;

public class Program {

    public static void main(String[] args) {
        Personagem rei = new Rei();
        Personagem rainha = new Rainha();
        Personagem guerreiro = new Guerreiro();
        Personagem duende = new Duende();

        rei.lutar();
        System.out.println("-------------");
        rainha.lutar();
        System.out.println("-------------");
        guerreiro.lutar();
        System.out.println("-------------");
        duende.lutar();
        System.out.println("-------------");
    }
}